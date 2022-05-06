package models.languages;

/**
 * The enum Language type.
 */
public enum LanguageType {
    /**
     * Abyssal language type.
     */
    abyssal("abyssal"),
    /**
     * Celestial language type.
     */
    celestial("celestial"),
    /**
     * Common language type.
     */
    common("common"),
    /**
     * Deepspeech language type.
     */
    deepspeech("deep-speech"),
    /**
     * Draconic language type.
     */
    draconic("draconic"),
    /**
     * Dwarvish language type.
     */
    dwarvish("dwarvish"),
    /**
     * Elvish language type.
     */
    elvish("elvish"),
    /**
     * Giant language type.
     */
    giant("giant"),
    /**
     * Gnomish language type.
     */
    gnomish("gnomish"),
    /**
     * Goblin language type.
     */
    goblin("goblin"),
    /**
     * Halfling language type.
     */
    halfling("halfling"),
    /**
     * Infernal language type.
     */
    infernal("infernal"),
    /**
     * Orc language type.
     */
    orc("orc"),
    /**
     * Primordial language type.
     */
    primordial("primordial"),
    /**
     * Sylvan language type.
     */
    sylvan("sylvan"),
    /**
     * Undercommon language type.
     */
    undercommon("undercommon");

    private String description;

    LanguageType(String description) {
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
