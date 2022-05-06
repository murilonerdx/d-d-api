package models.utility.path;

/**
 * The enum Class level type.
 */
public enum ClassLevelType {
    /**
     * Levels class level type.
     */
    LEVELS("api/classes/{index}/levels/{class_level}");

    private String endpoint;

    ClassLevelType(String endpoint) {
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
