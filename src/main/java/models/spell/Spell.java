package models.spell;

import models.spellcasting.SpellCastingType;
import models.subclasse.SubClass;
import models.utility.DefaultDataAPI;
import models.utility.RequestAPI;
import models.utility.RequestDefaultResource;
import models.utility.path.ClassDataType;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static utils.APIProperties.getServer;

public class Spell extends RequestDefaultResource {
    public static List<Spell> get() throws IOException {
        List<Spell> spell_casting = new ArrayList<>();
        SpellCastingType[] values = SpellCastingType.values();

        for(SpellCastingType type : values){
            Spell index = getIndex(type);
            spell_casting.add(index);
        }

        return spell_casting;
    }
    public static Spell getIndex(SpellCastingType type) throws IOException {
        String path = getServer() + ClassDataType.SPELL.endpointReplace(type.name());
        return (Spell) RequestAPI.GET(path, Spell.class);
    }

}
