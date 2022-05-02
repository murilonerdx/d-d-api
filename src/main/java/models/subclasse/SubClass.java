package models.subclasse;

import com.google.gson.Gson;
import models.alignment.Alignment;
import models.alignment.AlignmentType;
import models.spellcasting.SpellCasting;
import models.spellcasting.SpellCastingType;
import models.utility.RequestAPI;
import models.utility.RequestDefaultResource;
import models.utility.path.CharacterDataType;
import models.utility.path.ClassDataType;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static utils.APIProperties.getServer;

public class SubClass extends RequestDefaultResource {
    public static List<SubClass> get() throws IOException {
        List<SubClass> spell_casting = new ArrayList<>();
        SpellCastingType[] values = SpellCastingType.values();

        for(SpellCastingType type : values){
            SubClass index = getIndex(type);
            spell_casting.add(index);
        }

        return spell_casting;
    }
    public static SubClass getIndex(SpellCastingType type) throws IOException {
        String path = getServer() + ClassDataType.SUBCLASS.endpointReplace(type.name());
        return (SubClass) RequestAPI.GET(path, SubClass.class);
    }
}
