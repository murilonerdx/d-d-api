package models.utility;

public enum CharacterData {
    ABILITYSCORE("/api/ability-scores/");

    private String endpoint;
    CharacterData(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
}
