import models.ability.AbilityScoreType;
import models.alignment.AlignmentType;
import models.classe.Classe;
import models.classe.ClasseType;
import models.features.Feature;
import models.languages.Language;
import models.languages.LanguageType;
import models.proficiency.Proficiencies;
import models.proficiency.Proficiency;
import models.skill.Skill;
import models.skill.SkillType;
import models.spell.Spell;
import models.spellcasting.SpellCasting;
import models.spellcasting.SpellCastingType;
import models.subclasse.SubClass;
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

        List<SpellCasting> requestDefaultResource7 = SpellCasting.get();
        List<SubClass> requestDefaultResource8 = SubClass.get();
        List<Spell> requestDefaultResource9 = Spell.get();
        List<Feature> requestDefaultResource10 = Feature.get();
        List<Proficiencies> requestDefaultResource11 = Proficiencies.get();

        AbilityScore ability_score = AbilityScore.getIndex(AbilityScoreType.charisma);
        Alignment alignment = Alignment.getIndex(AlignmentType.CE);
        Language language = Language.getIndex(LanguageType.draconic);
        Proficiency proficiency = Proficiency.getIndex("medium-armor");
        Skill skill = Skill.getIndex(SkillType.history);
        Classe classe = Classe.getIndex(ClasseType.monk);

        SpellCasting spell_casting = SpellCasting.getIndex(SpellCastingType.druid);
        SubClass sub_class = SubClass.getIndex(SpellCastingType.druid);
        Spell spell = Spell.getIndex(SpellCastingType.ranger);
        Feature feature = Feature.getIndex(SpellCastingType.wizard);
        Proficiencies proficiencies = Proficiencies.getIndex(SpellCastingType.warlock);

        List<DefaultDataAPI> list_proficincy = Proficiency.searchProficiency("ate");
        List<Classe> list_classe = Classe.searchClasse(ClasseType.wizard);

        System.out.println(requestDefaultResource1);
        System.out.println(requestDefaultResource2);
        System.out.println(requestDefaultResource3);
        System.out.println(requestDefaultResource4);
        System.out.println(requestDefaultResource5);
        System.out.println(requestDefaultResource6);
        System.out.println(requestDefaultResource7);
        System.out.println(requestDefaultResource8);
        System.out.println(requestDefaultResource9);
        System.out.println(requestDefaultResource10);
        System.out.println(requestDefaultResource11);

        System.out.println("\n\n#######");

        System.out.println(ability_score);
        System.out.println(alignment);
        System.out.println(language);
        System.out.println(proficiency);
        System.out.println(skill);
        System.out.println(classe);
        System.out.println(spell_casting);
        System.out.println(sub_class);
        System.out.println(spell);
        System.out.println(feature);
        System.out.println(proficiencies);

        System.out.println("\n\n#######");

        System.out.println(list_proficincy);
        System.out.println(list_classe);


    }
}
