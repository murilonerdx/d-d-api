package models.proficiency;

import models.spell.Spell;
import models.spellcasting.SpellCastingType;
import models.utility.RequestAPI;
import models.utility.RequestDefaultResource;
import models.utility.path.ClassDataType;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static utils.APIProperties.getServer;

public class Proficiencies extends RequestDefaultResource {
    public static List<Proficiencies> get() throws IOException {
        List<Proficiencies> spell_casting = new ArrayList<>();
        SpellCastingType[] values = SpellCastingType.values();

        for(SpellCastingType type : values){
            Proficiencies index = getIndex(type);
            spell_casting.add(index);
        }

        return spell_casting;
    }

    public static Proficiencies getIndex(SpellCastingType type) throws IOException {
        String path = getServer() + ClassDataType.PROFICIENCIES.endpointReplace(type.name());
        return (Proficiencies) RequestAPI.GET(path, Proficiencies.class);
    }
}
