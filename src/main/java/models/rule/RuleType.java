package models.rule;

public enum RuleType {
    adventuring,
    appendix,
    combat,
    equipment,
    spellcasting,
    using_ability_scores;

    public String getName(RuleType rule) {
        return rule.name().replace("_", "-");
    }
}
