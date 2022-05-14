package models.rule;

public enum RuleSectionTypes {
    ability_checks,
    ability_scores_and_modifiers,
    actions_in_combat,
    advantage_and_disadvantage,
    between_adventures,
    casting_a_spell,
    cover,
    damage_and_healing,
    diseases,
    fantasy_historical_pantheons,
    madness,
    making_an_attack,
    mounted_combat,
    movement,
    movement_and_position,
    objects,
    poisons,
    proficiency_bonus,
    resting,
    saving_throws,
    sentient_magic_items,
    standard_exchange_rates,
    the_environment,
    the_order_of_combat,
    the_planes_of_existence,
    time,
    traps,
    underwater_combat,
    using_each_ability,
    what_is_a_spell;

    public String getName(RuleSectionTypes ruleSection) {
        return ruleSection.name().replace("_", "-");
    }
}
