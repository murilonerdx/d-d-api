package models.annotations;

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
import models.proficiency.Proficiency;
import models.skill.Skill;
import models.skill.SkillType;
import models.spell.Spell;
import models.spellcasting.SpellCasting;
import models.spellcasting.SpellCastingType;
import models.subclasse.SubClass;

import java.io.IOException;

public abstract class Gen {
    public static Hero getAnnotation(Class<?> object) throws IOException {
        GenerateHero gh = object.getAnnotation(GenerateHero.class);

        String name = gh.value();
        AbilityScoreType abilityScoreType = gh.ability_score();
        ClasseType classe = gh.classe();
        AlignmentType alignment = gh.alignment();
        SpellCastingType spellcasting = gh.spellcasting();
        SpellCastingType features = gh.features();
        SpellCastingType levels = gh.levels();
        SkillType skill = gh.skill();
        ClasseType spell = gh.spell();
        LanguageType languages = gh.languages();
        ClasseType sub_class = gh.subclasse();
        String proficiency = gh.proficiency();
        int level_number = gh._level();

        return new Hero(name,
                AbilityScore.getIndex(abilityScoreType),
                Alignment.getIndex(alignment),
                Classe.getIndex(classe),
                null,
                Feature.getIndex(features),
                Language.getIndex(languages),
                Level.getIndex(levels, level_number),
                Proficiency.getIndex(proficiency),
                Skill.getIndex(skill),
                Spell.getIndex(spell),
                SpellCasting.getIndex(spellcasting),
                SubClass.getIndex(sub_class)
                );
    }
}
