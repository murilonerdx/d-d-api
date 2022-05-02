package models.classe;

import models.utility.DefaultDataAPI;
import models.proficiency.ProficiencyChoices;

import java.util.Arrays;

class MultiClasse {
    private Prerequisite[] prerequisites;
    private Prerequisite.PrerequisiteOptions[] prerequisite_options;
    private DefaultDataAPI[] proficiencies;
    private ProficiencyChoices[] proficiency_choices;

    public Prerequisite[] getPrerequisites() {
        return prerequisites;
    }

    public Prerequisite.PrerequisiteOptions[] getPrerequisite_options() {
        return prerequisite_options;
    }

    public DefaultDataAPI[] getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(DefaultDataAPI[] proficiencies) {
        this.proficiencies = proficiencies;
    }

    public ProficiencyChoices[] getProficiency_choises() {
        return proficiency_choices;
    }

    public void setProficiency_choises(ProficiencyChoices[] proficiency_choices) {
        this.proficiency_choices = proficiency_choices;
    }

    public void setPrerequisites(Prerequisite[] prerequisites) {
        this.prerequisites = prerequisites;
    }

    public void setPrerequisite_options(Prerequisite.PrerequisiteOptions[] prerequisite_options) {
        this.prerequisite_options = prerequisite_options;
    }

    @Override
    public String toString() {
        return "{" +
                "prerequisites=" + Arrays.toString(prerequisites) +
                ", prerequisite_options=" + Arrays.toString(prerequisite_options) +
                ", proficiencies=" + Arrays.toString(proficiencies) +
                ", proficiency_choises=" + Arrays.toString(proficiency_choices) +
                '}';
    }
}


