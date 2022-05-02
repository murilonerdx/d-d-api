package models.languages;

public enum LanguageType {
    abyssal("abyssal"),
    celestial("celestial"),
    common("common"),
    deepspeech("deep-speech"),
    draconic("draconic"),
    dwarvish("dwarvish"),
    elvish("elvish"),
    giant("giant"),
    gnomish("gnomish"),
    goblin("goblin"),
    halfling("halfling"),
    infernal("infernal"),
    orc("orc"),
    primordial("primordial"),
    sylvan("sylvan"),
    undercommon("undercommon");

    private String description;

    LanguageType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
