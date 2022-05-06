package models.utility.path;

/**
 * The enum Class data type.
 */
public enum ClassDataType {
    /**
     * Classes class data type.
     */
    CLASSES("api/classes/"),
    /**
     * Spellcasting class data type.
     */
    SPELLCASTING("api/classes/{index}/spellcasting"),
    /**
     * Subclass class data type.
     */
    SUBCLASS("api/classes/{index}/subclasses"),
    /**
     * Spell class data type.
     * Spell class data type.
     */
    SPELL("api/classes/{index}/spells"),
    /**
     * Features class data type.
     */
    FEATURES("api/classes/{index}/features"),
    /**
     * Proficiencies class data type.
     */
    PROFICIENCIES("api/classes/{index}/proficiencies");

    private String endpoint;

    ClassDataType(String endpoint) {
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

    /**
     * Endpoint replace string.
     *
     * @param index the index
     * @return the string
     */
    public String endpointReplace(String index) {
        return getEndpoint().replace("{index}", index);
    }
}
