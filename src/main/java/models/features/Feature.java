package models.features;

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
     *
     * @param type the type
     * @return the index
     * @throws IOException the io exception
     */
    public static Feature getIndex(SpellCastingType type) throws IOException {
        String path = getServer() + ClassDataType.FEATURES.endpointReplace(type.name());
        return (Feature) RequestAPI.GET(path, Feature.class);
    }
}
