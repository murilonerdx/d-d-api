package models.utility;

import models.ability.AbilityScore;
import models.ability.AbilityScoreType;
import models.alignment.Alignment;
import models.alignment.AlignmentType;
import models.classe.Classe;
import models.classe.ClasseType;
import models.equipament.EquipamentCategory;
import models.equipament.Equipment;
import models.equipament.MagicItem;
import models.equipament.WeaponProperty;
import models.equipament.enums.WeaponPropertyType;
import models.feat.Feat;
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

public enum EPV {
    CLASSE(Classe.class, ClasseType.class),
    ABILITY(AbilityScore.class, AbilityScoreType.class),
    ALIGNMENT(Alignment.class, AlignmentType.class),
    FEATURES(Feature.class, SpellCastingType.class),
    LANGUAGES(Language.class, LanguageType.class),
    LEVELS(Level.class, SpellCastingType.class),
    PROFICIENCY(Proficiency.class, String.class),
    SKILL(Skill.class, SkillType.class),
    SPELL(Spell.class, ClasseType.class),
    SPELL_CASTING(SpellCasting.class, SpellCastingType.class),
    SUB_CLASSE(SubClass.class, ClasseType.class),
    FEAT(Feat.class, String.class),
    DAMAGE(EquipamentCategory.class, String.class),
    EQUIPMENT(Equipment.class, String.class),
    MAGIC_ITEM(MagicItem.class, String.class),
    WEAPON_PROPERTIERS(WeaponProperty.class, WeaponPropertyType.class);

    private Class<?> type;
    private Class<?> classType;

    EPV(Class<?> type, Class<?> classType){
        this.classType=classType;
        this.type = type;
    }

    public Class<?> getType() {
        return type;
    }

    public void setType(Class<?> type) {
        this.type = type;
    }

    public Class<?> getClassType() {
        return classType;
    }

    public void setClassType(Class<?> classType) {
        this.classType = classType;
    }
}
