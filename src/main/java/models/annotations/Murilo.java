package models.annotations;

import models.ability.AbilityScore;
import models.ability.AbilityScoreType;
import models.alignment.AlignmentType;
import models.classe.ClasseType;
import models.features.Feature;
import models.skill.SkillType;
import models.spellcasting.SpellCastingType;

@GenerateHero(value = "Murilo",
        classe = ClasseType.bard,
        ability_score = AbilityScoreType.charisma,
        alignment = AlignmentType.CE,
        features = SpellCastingType.druid,
        levels = SpellCastingType.warlock,
        proficiency = "",
        skill = SkillType.arcana,
        spell = ClasseType.paladin,
        spellcasting = SpellCastingType.wizard,
        subclasse = ClasseType.wizard)
public interface Murilo{
}
