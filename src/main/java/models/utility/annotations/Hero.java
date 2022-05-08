package models.utility.annotations;

import models.ability.AbilityScore;
import models.alignment.Alignment;
import models.classe.Classe;
import models.equipament.StartEquipment;
import models.features.Feature;
import models.languages.Language;
import models.levels.Level;
import models.proficiency.Proficiency;
import models.skill.Skill;
import models.spell.Spell;
import models.spellcasting.SpellCasting;
import models.subclasse.SubClass;

public class Hero {
    private String name;
    private AbilityScore abilityScore;
    private Alignment alignment;
    private Classe classe;
    private StartEquipment equipament;
    private Feature features;
    private Language languages;
    private Level levels;
    private Proficiency proficiency;
    private Skill skill;
    private Spell spell;
    private SpellCasting spell_casting;
    private SubClass sub_class;

    public Hero(String name, AbilityScore abilityScore, Alignment alignment, Classe classe, StartEquipment equipament, Feature features, Language languages, Level levels, Proficiency proficiency, Skill skill, Spell spell, SpellCasting spell_casting, SubClass sub_class) {
        this.name = name;
        this.abilityScore = abilityScore;
        this.alignment = alignment;
        this.classe = classe;
        this.equipament = equipament;
        this.features = features;
        this.languages = languages;
        this.levels = levels;
        this.proficiency = proficiency;
        this.skill = skill;
        this.spell = spell;
        this.spell_casting = spell_casting;
        this.sub_class = sub_class;
    }

    public AbilityScore getAbilityScore() {
        return abilityScore;
    }

    public void setAbilityScore(AbilityScore abilityScore) {
        this.abilityScore = abilityScore;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public StartEquipment getEquipament() {
        return equipament;
    }

    public void setEquipament(StartEquipment equipament) {
        this.equipament = equipament;
    }

    public Feature getFeatures() {
        return features;
    }

    public void setFeatures(Feature features) {
        this.features = features;
    }

    public Language getLanguages() {
        return languages;
    }

    public void setLanguages(Language languages) {
        this.languages = languages;
    }

    public Level getLevels() {
        return levels;
    }

    public void setLevels(Level levels) {
        this.levels = levels;
    }

    public Proficiency getProficiency() {
        return proficiency;
    }

    public void setProficiency(Proficiency proficiency) {
        this.proficiency = proficiency;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public SpellCasting getSpell_casting() {
        return spell_casting;
    }

    public void setSpell_casting(SpellCasting spell_casting) {
        this.spell_casting = spell_casting;
    }

    public SubClass getSub_class() {
        return sub_class;
    }

    public void setSub_class(SubClass sub_class) {
        this.sub_class = sub_class;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "{" +
                "abilityScore=" + abilityScore +
                ", alignment=" + alignment +
                ", classe=" + classe +
                ", equipament=" + equipament +
                ", features=" + features +
                ", languages=" + languages +
                ", levels=" + levels +
                ", proficiency=" + proficiency +
                ", skill=" + skill +
                ", spell=" + spell +
                ", spell_casting=" + spell_casting +
                ", sub_class=" + sub_class +
                '}';
    }
}
