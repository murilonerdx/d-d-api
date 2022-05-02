import models.ability.AbilityScoreType;
import models.alignment.AlignmentType;
import models.classe.Classe;
import models.classe.ClasseType;
import models.languages.Language;
import models.languages.LanguageType;
import models.proficiency.Proficiency;
import models.skill.Skill;
import models.skill.SkillType;
import models.utility.DefaultDataAPI;
import models.utility.RequestDefaultResource;
import models.ability.AbilityScore;
import models.alignment.Alignment;

import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        RequestDefaultResource requestDefaultResource1 = AbilityScore.get();
        RequestDefaultResource requestDefaultResource2 = Alignment.get();
        RequestDefaultResource requestDefaultResource3 = Language.get();
        RequestDefaultResource requestDefaultResource4 = Proficiency.get();
        RequestDefaultResource requestDefaultResource5 = Skill.get();
        RequestDefaultResource requestDefaultResource6 = Classe.get();


        AbilityScore ability_score = AbilityScore.getIndex(AbilityScoreType.charisma);
        Alignment alignment = Alignment.getIndex(AlignmentType.CE);
        Language language = Language.getIndex(LanguageType.draconic);
        Proficiency proficiency = Proficiency.getIndex("medium-armor");
        Skill skill = Skill.getIndex(SkillType.history);
        List<DefaultDataAPI> list_proficincy = Proficiency.searchProficiency("ate");
        Classe classe = Classe.getIndex(ClasseType.bard);

        System.out.println(requestDefaultResource1);
        System.out.println(requestDefaultResource2);
        System.out.println(requestDefaultResource3);
        System.out.println(requestDefaultResource4);
        System.out.println(requestDefaultResource5);
        System.out.println(requestDefaultResource6);
        System.out.println("#######");
        System.out.println(ability_score);
        System.out.println(alignment);
        System.out.println(language);
        System.out.println(proficiency);
        System.out.println(skill);
        System.out.println(list_proficincy);
        System.out.println(classe);


    }
}
