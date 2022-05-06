package models.skill;

/**
 * The enum Skill type.
 */
public enum SkillType {
    /**
     * Acrobatics skill type.
     */
    acrobatics("acrobatics"),
    /**
     * Animal handling skill type.
     */
    animal_handling("animal-handling"),
    /**
     * Arcana skill type.
     */
    arcana("arcana"),
    /**
     * Athletics skill type.
     */
    athletics("athletics"),
    /**
     * Deception skill type.
     */
    deception("deception"),
    /**
     * History skill type.
     */
    history("history"),
    /**
     * Insight skill type.
     */
    insight("insight"),
    /**
     * Intimidation skill type.
     */
    intimidation("intimidation"),
    /**
     * Investigation skill type.
     */
    investigation("investigation"),
    /**
     * Medicine skill type.
     */
    medicine("medicine"),
    /**
     * Nature skill type.
     */
    nature("nature"),
    /**
     * Perception skill type.
     */
    perception("perception"),
    /**
     * Performance skill type.
     */
    performance("performance"),
    /**
     * Persuasion skill type.
     */
    persuasion("persuasion"),
    /**
     * Religion skill type.
     */
    religion("religion"),
    /**
     * Sleight of hand skill type.
     */
    sleight_of_hand("sleight-of-hand"),
    /**
     * Stealth skill type.
     */
    stealth("stealth"),
    /**
     * Survival skill type.
     */
    survival("survival");

    private String description;

    SkillType(String description) {
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
