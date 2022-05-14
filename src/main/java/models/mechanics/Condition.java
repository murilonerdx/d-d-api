package models.mechanics;

import models.mechanics.enums.ConditionType;
import models.utility.DefaultDataAPI;
import models.utility.RequestAPI;
import models.utility.annotations.TypedForge;
import models.utility.path.ClassGameMechanics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static utils.APIProperties.getServer;

/**
 * The type Condition.
 * A condition alters a creature’s capabilities in a variety of ways and can arise as a result of a spell, a class feature, a monster’s attack, or other effect.
 * Most conditions, such as blinded, are impairments, but a few, such as invisible, can be advantageous.
 */
@TypedForge(name="condition", forge= ConditionType.class)
public class Condition extends DefaultDataAPI {
    private String[] desc;

    /**
     * Get desc string [ ].
     *
     * @return the string [ ]
     */
    public String[] getDesc() {
        return desc;
    }

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String[] desc) {
        this.desc = desc;
    }

    /**
     * Get list.
     *
     * @return the list
     * @return {@link List}
     * @throws IOException the io exception
     *                     <p>
     *                     Get list.
     * @throws IOException java.io. i o exception
     * @see List
     * @see Condition
     */
/**
     *  Get list.
     *
     * @return {@link List}
     * @see List
     * @see Condition
     * @throws IOException java.io. i o exception
     */
    public static List<Condition> get() throws IOException {
        List<Condition> condition_list = new ArrayList<>();
        ConditionType[] values = ConditionType.values();

        for (ConditionType type : values) {
            Condition index = getIndex(type);
            condition_list.add(index);
        }

        return condition_list;
    }

    /**
     * Gets index.
     *
     * @param type the type
     * @return the index
     * @throws IOException the io exception
     */
    public static Condition getIndex(ConditionType type) throws IOException {
        String path = getServer() + ClassGameMechanics.CONDITIONS.endpointReplace(type.name());
        return (Condition) RequestAPI.GET(path, Condition.class);
    }

    @Override
    public String toString() {
        return "Condition{" +
                "index=" + getIndex() +
                ", name=" + getName() +
                ", url=" + getUrl() +
                ", desc=" + Arrays.toString(desc) +
                '}';
    }


}
