package models.utility.path;

/**
 * The enum Character data type.
 */
public enum CharacterDataType {
    /**
     * Abilityscore character data type.
     */
    ABILITYSCORE("api/ability-scores/"),
    /**
     * Alignment character data type.
     */
    ALIGNMENT("api/alignments/"),
    /**
     * Languages character data type.
     */
    LANGUAGES("api/languages/"),
    /**
     * Proficiency character data type.
     */
    PROFICIENCY("api/proficiencies/"),
    /**
     * Skill character data type.
     */
    SKILL("api/skills/");


    private String endpoint;

    CharacterDataType(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Gets endpoint.
     *
     * @return the endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * Sets endpoint.
     *
     * @param endpoint the endpoint
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
}
