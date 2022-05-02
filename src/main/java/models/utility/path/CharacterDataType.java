package models.utility.path;

public enum CharacterDataType {
    ABILITYSCORE("api/ability-scores/"),
    ALIGNMENT("api/alignments/"),
    LANGUAGES("api/languages/"),
    PROFICIENCY("api/proficiencies/"),
    SKILL("api/skills/");


    private String endpoint;
    CharacterDataType(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
}
