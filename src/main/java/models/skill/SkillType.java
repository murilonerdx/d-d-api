package models.skill;

public enum SkillType {
    acrobatics("acrobatics"),
    animal_handling("animal-handling"),
    arcana("arcana"),
    athletics("athletics"),
    deception("deception"),
    history("history"),
    insight("insight"),
    intimidation("intimidation"),
    investigation("investigation"),
    medicine("medicine"),
    nature("nature"),
    perception("perception"),
    performance("performance"),
    persuasion("persuasion"),
    religion("religion"),
    sleight_of_hand("sleight-of-hand"),
    stealth("stealth"),
    survival("survival");

    private String description;

    SkillType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
