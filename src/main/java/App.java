import models.ability.AbilityScore;
import models.ability.AbilityScoreType;
import models.alignment.Alignment;
import models.alignment.AlignmentType;
import models.classe.Classe;
import models.classe.ClasseType;
import models.classe.spell.SpellHability;
import models.equipament.EquipmentCategory;
import models.equipament.Equipment;
import models.equipament.MagicItem;
import models.equipament.WeaponProperty;
import models.equipament.enums.WeaponPropertyType;
import models.feat.Feat;
import models.classe.features.Feature;
import models.languages.Language;
import models.languages.LanguageType;
import models.levels.Level;
import models.mechanics.Condition;
import models.mechanics.MagicSchool;
import models.mechanics.enums.ConditionType;
import models.mechanics.Damage;
import models.mechanics.enums.DamageType;
import models.mechanics.enums.MagicSchoolType;
import models.monsters.Monster;
import models.monsters.MonsterFull;
import models.proficiency.Proficiencies;
import models.proficiency.Proficiency;
import models.races.Race;
import models.races.RaceType;
import models.rule.Rule;
import models.rule.RuleSectionTypes;
import models.rule.RuleType;
import models.skill.Skill;
import models.skill.SkillType;
import models.classe.spell.Spell;
import models.spellcasting.SpellCasting;
import models.spellcasting.SpellCastingType;
import models.classe.subclasse.SubClass;
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
        RequestDefaultResource requestDefaultResource16 = Equipment.get();
        RequestDefaultResource requestDefaultResource17 = Feat.get();
        RequestDefaultResource requestDefaultResource18 = Monster.get();
        RequestDefaultResource requestDefaultResource9_1 = Spell.getAll();

        List<SpellCasting> requestDefaultResource7 = SpellCasting.get();
        List<SubClass> requestDefaultResource8 = SubClass.get();
        List<Spell> requestDefaultResource9 = Spell.get();
        List<Feature> requestDefaultResource10 = Feature.get();
        List<Proficiencies> requestDefaultResource11 = Proficiencies.get();
        List<Level> requestDefaultResource12 = Level.get();
        List<Condition> requestDefaultResource13 = Condition.get();
        List<Damage> requestDefaultResource14 = Damage.get();
        List<MagicSchool> requestDefaultResource15 = MagicSchool.get();


        AbilityScore ability_score = AbilityScore.getIndex(AbilityScoreType.charisma);
        Alignment alignment = Alignment.getIndex(AlignmentType.CE);
        Language language = Language.getIndex(LanguageType.draconic);
        Proficiency proficiency = Proficiency.getIndex("medium-armor");
        Skill skill = Skill.getIndex(SkillType.history);
        Classe classe = Classe.getIndex(ClasseType.monk);
        Condition condition = Condition.getIndex(ConditionType.blinded);
        Damage damage_types = Damage.getIndex(DamageType.cold);
        SpellHability spell_hability = SpellHability.getIndex("sacred-flame");

        Level level = Level.getIndex(SpellCastingType.wizard, 5);
        List<Level> level2 = Level.getSubclass(ClasseType.rogue, SpellCastingType.cleric);

        SpellCasting spell_casting = SpellCasting.getIndex(SpellCastingType.druid);

        SubClass sub_class = SubClass.getIndex(ClasseType.druid);
        Spell spell = Spell.getIndex(ClasseType.ranger);
        Feature feature = Feature.getIndex(SpellCastingType.wizard);
        Object feature2 = Feature.getRuleIndex("action-surge-1-use");
        Proficiencies proficiencies = Proficiencies.getIndex(SpellCastingType.warlock);
        MagicSchool magic_schools = MagicSchool.getIndex(MagicSchoolType.abjuration);
        EquipmentCategory equipment = EquipmentCategory.getIndex("ammunition");
        MagicItem magic_item = MagicItem.getIndex("ammunition");
        WeaponProperty weapon_property = WeaponProperty.getIndex(WeaponPropertyType.ammunition);
        Feat feat = Feat.getIndex("grappler");
        MonsterFull monster = Monster.getIndex("aboleth");
        Race races1 = Race.getIndex(RaceType.half_elf);
        RequestDefaultResource races2 = Race.getIndexSubraces(RaceType.half_elf);
        RequestDefaultResource races3 = Race.getIndexProficiencies(RaceType.half_elf);
        RequestDefaultResource races4 = Race.getIndexTraits(RaceType.half_elf);
        Rule ruleIndex = Rule.getIndex(RuleType.using_ability_scores);
        Rule ruleSection = Rule.getIndexSection(RuleSectionTypes.damage_and_healing);

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
        print(requestDefaultResource9_1);
        print(requestDefaultResource10);
        print(requestDefaultResource11);
        print(requestDefaultResource12);
        print(requestDefaultResource13);
        print(requestDefaultResource14);
        print(requestDefaultResource15);
        print(requestDefaultResource16);
        print(requestDefaultResource17);
        print(requestDefaultResource18);


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
        print(feature2);
        print(proficiencies);
        print(level);
        print(level2);
        print(condition);
        print(damage_types);
        print(magic_schools);
        print(equipment);
        print(magic_item);
        print(weapon_property);
        print(feat);
        print(monster);
        print(races1);
        print(races2);
        print(races3);
        print(races4);
        print(ruleIndex);
        print(ruleSection);
        print(spell_hability);

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
