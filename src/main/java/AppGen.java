import models.ability.AbilityScore;
import models.alignment.Alignment;
import models.classe.Classe;
import models.classe.features.Feature;
import models.languages.Language;
import models.levels.Level;
import models.proficiency.Proficiencies;
import models.skill.Skill;
import models.classe.spell.Spell;
import models.spellcasting.SpellCasting;
import models.classe.subclasse.SubClass;
import models.utility.EPV;
import models.utility.annotations.Gen;
import models.utility.annotations.Murilo;

import java.util.function.Consumer;

public class AppGen {

    public static void main(String[] args) throws Exception {
        /*
        _level = 1,
        classe = ClasseType.bard,
        ability_score = AbilityScoreType.charisma,
        alignment = AlignmentType.CE,
        features = SpellCastingType.druid,
        levels = SpellCastingType.druid,
        proficiency = "medium-armor",
        skill = SkillType.arcana,
        spell = ClasseType.paladin,
        spellcasting = SpellCastingType.wizard,
        subclasse = ClasseType.wizard,
        language = LanguageType.draconic)
        */
//        Hero hero = Gen.getHeroProperties(Murilo.class);

        AbilityScore ability_score = (AbilityScore) Gen.get(AbilityScore.class, Murilo.class);
        Language language = (Language) Gen.get(Language.class, Murilo.class);
        Classe classe = (Classe) Gen.get(Classe.class, Murilo.class);
        Alignment alignment = (Alignment) Gen.get(Alignment.class, Murilo.class);
        Feature feature = (Feature) Gen.get(Feature.class, Murilo.class);
        Level level = (Level) Gen.get(Level.class, Murilo.class);
        Proficiencies proficiencies = (Proficiencies) Gen.get(Proficiencies.class, Murilo.class);
        Skill skill = (Skill) Gen.get(EPV.SKILL.getType(), Murilo.class);
        Spell spell = (Spell) Gen.get(Spell.class, Murilo.class);
        SpellCasting spell_casting = (SpellCasting) Gen.get(SpellCasting.class, Murilo.class);
        SubClass sub_class = (SubClass) Gen.get(SubClass.class, Murilo.class);

        print(ability_score);
        print(classe);
        print(language);
        print(proficiencies);
        print(feature);
        print(level);
        print(skill);
        print(spell);
        print(spell_casting);
        print(classe);
        print(sub_class);
        print(alignment);
    }

    private static void print(Object r) {
        print().accept(r);
    }

    public static Consumer<Object> print() {
        return System.out::println;
    }

}
