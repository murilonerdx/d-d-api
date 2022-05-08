package models.mechanics;

import models.mechanics.enums.ConditionType;
import models.utility.DefaultDataAPI;
import models.utility.RequestAPI;
import models.utility.annotations.TypedForge;
import models.utility.path.ClassGameMechanics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static utils.APIProperties.getServer;

@TypedForge(name="condition", forge= ConditionType.class)
public class Condition extends DefaultDataAPI {
    private String[] desc;

    public String[] getDesc() {
        return desc;
    }

    public void setDesc(String[] desc) {
        this.desc = desc;
    }

    /**
     * Get list.
     *
     * @return the list
     * @throws IOException the io exception
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
}
