package models.utility.path;

public enum ClassDataType {
    CLASSES("/api/classes/");

    private String endpoint;
    ClassDataType(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
}
