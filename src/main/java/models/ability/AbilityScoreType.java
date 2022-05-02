package models.ability;

public enum AbilityScoreType {
    charisma("cha"),
    constitution("con"),
    dexterity("dex"),
    intelligence("int"),
    strength("str"),
    wisdom("wis");

    private String description;

    AbilityScoreType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    }
