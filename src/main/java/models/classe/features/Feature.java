package models.classe.features;

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
 * The type Feature.
 */
@TypedForge(name="feature", forge= SpellCastingType.class)
public class Feature extends RequestDefaultResource {
    /**
     * Get list.
     *
     * @return the list
     * @throws IOException the io exception
     */
    public static List<Feature> get() throws IOException {
        List<Feature> feature_list = new ArrayList<>();
        SpellCastingType[] values = SpellCastingType.values();

        for (SpellCastingType type : values) {
            Feature index = getIndex(type);
            feature_list.add(index);
        }

        return feature_list;
    }

    /**
     * Gets index.
     * When you gain a new level in a class, you get its features for that level.
     * You don’t, however, receive the class’s starting Equipment, and a few features have additional rules when you’re multiclassing: Channel Divinity, Extra Attack, Unarmored Defense, and Spellcasting.
     * @param type the type
     * @return the index
     * @throws IOException the io exception
     */
    public static Feature getIndex(SpellCastingType type) throws IOException {
        String path = getServer() + ClassDataType.FEATURES.endpointReplace(type.name());
        return (Feature) RequestAPI.GET(path, Feature.class);
    }

    public static Object getRuleIndex(String name) throws IOException {
        String path = getServer() + ClassDataType.FEATURE.endpointReplace(name);
        return RequestAPI.GET(path, Object.class);
    }
}
