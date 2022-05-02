package models.utility.path;

public enum ClassDataType {
    CLASSES("api/classes/"),
    SPELLCASTING("api/classes/{index}/spellcasting"),
    SUBCLASS("api/classes/{index}/subclasses"),
    SPELL("api/classes/{index}/spells"),
    FEATURES("api/classes/{index}/features"),
    PROFICIENCIES("api/classes/{index}/proficiencies");

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

    public String endpointReplace(String index){
        return getEndpoint().replace("{index}", index);
    }
}
