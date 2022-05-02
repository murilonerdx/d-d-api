import models.ability.AbilityScore;
import models.ability.AbilityScoreType;
import models.alignment.Alignment;
import models.alignment.AlignmentType;
import models.languages.Language;
import models.languages.LanguageType;
import models.proficiency.Proficiency;
import models.utility.RequestDefaultResource;

import javax.xml.transform.Result;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        RequestDefaultResource requestDefaultResource1 = AbilityScore.get();
        RequestDefaultResource requestDefaultResource2 = Alignment.get();
        RequestDefaultResource requestDefaultResource3 = Language.get();
        RequestDefaultResource requestDefaultResource4 = Proficiency.get();

        AbilityScore index = AbilityScore.getIndex(AbilityScoreType.charisma);
        Alignment index2 = Alignment.getIndex(AlignmentType.CE);
        Language index3 = Language.getIndex(LanguageType.draconic);
        Proficiency index4 = Proficiency.getIndex("medium-armor");

        System.out.println(requestDefaultResource1);
        System.out.println(requestDefaultResource2);
        System.out.println(requestDefaultResource3);
        System.out.println(requestDefaultResource4);
        System.out.println("#######");
        System.out.println(index);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);


    }
}
