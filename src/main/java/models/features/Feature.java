package models.features;

import models.spell.Spell;
import models.spellcasting.SpellCastingType;
import models.utility.RequestAPI;
import models.utility.RequestDefaultResource;
import models.utility.path.ClassDataType;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static utils.APIProperties.getServer;

public class Feature extends RequestDefaultResource {
    public static List<Feature> get() throws IOException {
        List<Feature> spell_casting = new ArrayList<>();
        SpellCastingType[] values = SpellCastingType.values();

        for(SpellCastingType type : values){
            Feature index = getIndex(type);
            spell_casting.add(index);
        }

        return spell_casting;
    }
    public static Feature getIndex(SpellCastingType type) throws IOException {
        String path = getServer() + ClassDataType.FEATURES.endpointReplace(type.name());
        return (Feature) RequestAPI.GET(path, Feature.class);
    }
}
