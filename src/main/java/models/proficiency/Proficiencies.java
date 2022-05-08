package models.proficiency;

import models.utility.annotations.TypedForge;
import models.spellcasting.SpellCastingType;
import models.utility.RequestAPI;
import models.utility.RequestDefaultResource;
import models.utility.path.ClassDataType;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static utils.APIProperties.getServer;

/**
 * The type Proficiencies.
 */
@TypedForge(name="proficiencies", forge= SpellCastingType.class)
public class Proficiencies extends RequestDefaultResource {
    /**
     * Get list.
     *
     * @return the list
     * @throws IOException the io exception
     */
    public static List<Proficiencies> get() throws IOException {
        List<Proficiencies> proficiencie_list = new ArrayList<>();
        SpellCastingType[] values = SpellCastingType.values();

        for (SpellCastingType type : values) {
            Proficiencies index = getIndex(type);
            proficiencie_list.add(index);
        }

        return proficiencie_list;
    }

    /**
     * Gets index.
     *
     * @param type the type
     * @return the index
     * @throws IOException the io exception
     */
    public static Proficiencies getIndex(SpellCastingType type) throws IOException {
        String path = getServer() + ClassDataType.PROFICIENCIES.endpointReplace(type.name());
        return (Proficiencies) RequestAPI.GET(path, Proficiencies.class);
    }
}
