package models.spell;

import models.utility.annotations.TypedForge;
import models.classe.ClasseType;
import models.utility.RequestAPI;
import models.utility.RequestDefaultResource;
import models.utility.path.ClassDataType;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static utils.APIProperties.getServer;

/**
 * The type Spell.
 */
@TypedForge(name="spell", forge= ClasseType.class)
public class Spell extends RequestDefaultResource {
    /**
     * Get list.
     *
     * @return the list
     * @throws IOException the io exception
     */
    public static List<Spell> get() throws IOException {
        List<Spell> spell_list = new ArrayList<>();
        ClasseType[] values = ClasseType.values();

        for (ClasseType type : values) {
            Spell index = getIndex(type);
            spell_list.add(index);
        }

        return spell_list;
    }

    /**
     * Gets index.
     *
     * @param type the type
     * @return the index
     * @throws IOException the io exception
     */
    public static Spell getIndex(ClasseType type) throws IOException {
        String path = getServer() + ClassDataType.SPELL.endpointReplace(type.name());
        return (Spell) RequestAPI.GET(path, Spell.class);
    }
}
