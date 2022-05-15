package models.utility.annotations.example;

import models.ability.AbilityScoreType;
import models.alignment.AlignmentType;
import models.classe.ClasseType;
import models.languages.LanguageType;
import models.skill.SkillType;
import models.spellcasting.SpellCastingType;
import models.utility.annotations.GenerateHero;

@GenerateHero(name = "Murilo", _level = 1, classe = ClasseType.bard, ability_score = AbilityScoreType.charisma, alignment = AlignmentType.CE, feature = SpellCastingType.druid, level = SpellCastingType.druid, proficiency = "medium-armor", proficiencies = SpellCastingType.druid, skill = SkillType.arcana, spell = ClasseType.paladin, spell_casting = SpellCastingType.wizard, sub_classe = ClasseType.wizard, language = LanguageType.draconic)
public class Murilo {
}
