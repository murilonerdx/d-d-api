package models.annotations;


import models.ability.AbilityScoreType;
import models.alignment.AlignmentType;
import models.classe.ClasseType;
import models.languages.LanguageType;
import models.skill.SkillType;
import models.spellcasting.SpellCastingType;

import java.lang.annotation.*;

/**
 * The interface Generate hero.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface GenerateHero {
    /**
     * Value string.
     *
     * @return the string
     */
    String value();

    /**
     * Level int.
     *
     * @return the int
     */
    int _level() default 1;

    /**
     * Classe classe type.
     *
     * @return the classe type
     */
    ClasseType classe();

    /**
     * Ability score ability score type.
     *
     * @return the ability score type
     */
    AbilityScoreType ability_score();

    /**
     * Alignment alignment type.
     *
     * @return the alignment type
     */
    AlignmentType alignment();

    /**
     * Features spell casting type.
     *
     * @return the spell casting type
     */
    SpellCastingType features();

    /**
     * Levels spell casting type.
     *
     * @return the spell casting type
     */
    SpellCastingType levels();

    /**
     * Proficiency string.
     *
     * @return the string
     */
    String proficiency();

    /**
     * Skill skill type.
     *
     * @return the skill type
     */
    SkillType skill();

    /**
     * Spell classe type.
     *
     * @return the classe type
     */
    ClasseType spell();

    /**
     * Spellcasting spell casting type.
     *
     * @return the spell casting type
     */
    SpellCastingType spellcasting();

    /**
     * Subclasse classe type.
     *
     * @return the classe type
     */
    ClasseType subclasse();

    LanguageType languages() default LanguageType.common;
}
