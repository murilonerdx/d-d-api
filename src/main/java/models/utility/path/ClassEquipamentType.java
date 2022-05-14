package models.utility.path;

public enum ClassEquipamentType {
    EQUIPAMENT_CATEGORIES("api/equipment-categories/{index}"),
    MAGIC_ITEMS("api/magic-items/{index}"),
    WEAPON_PROPERTIES("api/weapon-properties/{index}"),
    EQUIPAMENT("/api/equipment/{index}");


    private String endpoint;

    ClassEquipamentType(String endpoint) {
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
