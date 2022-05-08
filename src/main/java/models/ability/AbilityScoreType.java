package models.ability;

/**
 * The enum Ability score type.
 */
public enum AbilityScoreType {
    /**
     * Charisma ability score type.
     */
    charisma("cha"),
    /**
     * Constitution ability score type.
     */
    constitution("con"),
    /**
     * Dexterity ability score type.
     */
    dexterity("dex"),
    /**
     * Intelligence ability score type.
     */
    intelligence("int"),
    /**
     * Strength ability score type.
     */
    strength("str"),
    /**
     * Wisdom ability score type.
     */
    wisdom("wis"),

    empty("");

    private String description;

    AbilityScoreType(String description) {
        this.description = description;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
