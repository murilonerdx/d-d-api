package models.utility.path;

public enum ClassGameMechanics {
    CONDITIONS("api/conditions/{index}"),
    DAMAGE_TYPES("api/damage-types/{index}"),
    MAGIC_SCHOOLS("api/magic-schools/{index}");

    private String endpoint;

    ClassGameMechanics(String endpoint) {
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
