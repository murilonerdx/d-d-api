import models.ability.AbilityScore;
import models.ability.AbilityScoreType;
import models.alignment.Alignment;
import models.alignment.AlignmentType;
import models.classe.Classe;
import models.classe.ClasseType;
import models.features.Feature;
import models.languages.Language;
import models.languages.LanguageType;
import models.levels.Level;
import models.mechanics.Condition;
import models.mechanics.enums.ConditionType;
import models.mechanics.Damage;
import models.mechanics.enums.DamageType;
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

import java.util.List;
import java.util.function.Consumer;

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
        List<Level> requestDefaultResource12 = Level.get();
        List<Condition> requestDefaultResource13 = Condition.get();
        List<Damage> requestDefaultResource14 = Damage.get();

        AbilityScore ability_score = AbilityScore.getIndex(AbilityScoreType.charisma);
        Alignment alignment = Alignment.getIndex(AlignmentType.CE);
        Language language = Language.getIndex(LanguageType.draconic);
        Proficiency proficiency = Proficiency.getIndex("medium-armor");
        Skill skill = Skill.getIndex(SkillType.history);
        Classe classe = Classe.getIndex(ClasseType.monk);
        Condition condition = Condition.getIndex(ConditionType.blinded);
        Damage damage_types = Damage.getIndex(DamageType.cold);

        Level level = Level.getIndex(SpellCastingType.wizard, 5);
        List<Level> level2 = Level.getSubclass(ClasseType.rogue, SpellCastingType.cleric);

        SpellCasting spell_casting = SpellCasting.getIndex(SpellCastingType.druid);

        SubClass sub_class = SubClass.getIndex(ClasseType.druid);
        Spell spell = Spell.getIndex(ClasseType.ranger);
        Feature feature = Feature.getIndex(SpellCastingType.wizard);
        Proficiencies proficiencies = Proficiencies.getIndex(SpellCastingType.warlock);

        List<DefaultDataAPI> list_proficincy = Proficiency.searchProficiency("ate");
        List<Classe> list_classe = Classe.searchClasse(ClasseType.wizard);

        print(requestDefaultResource1);
        print(requestDefaultResource2);
        print(requestDefaultResource3);
        print(requestDefaultResource4);
        print(requestDefaultResource5);
        print(requestDefaultResource6);
        print(requestDefaultResource7);
        print(requestDefaultResource8);
        print(requestDefaultResource9);
        print(requestDefaultResource10);
        print(requestDefaultResource11);
        print(requestDefaultResource12);
        print(requestDefaultResource13);
        print(requestDefaultResource14);


        System.out.println("\n\n#######");
        print(ability_score);
        print(alignment);
        print(language);
        print(proficiency);
        print(skill);
        print(classe);
        print(spell_casting);
        print(sub_class);
        print(spell);
        print(feature);
        print(proficiencies);
        print(level);
        print(level2);
        print(condition);
        print(damage_types);


        System.out.println("\n\n#######");
        print(list_proficincy);
        print(list_classe);
    }

    private static void print(Object r) {
        print().accept(r);
    }

    public static Consumer<Object> print() {
        return System.out::println;
    }
}
