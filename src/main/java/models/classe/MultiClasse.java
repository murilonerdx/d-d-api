package models.classe;

import models.utility.DefaultDataAPI;
import models.proficiency.ProficiencyChoices;

import java.util.Arrays;

class MultiClasse {
    private Prerequisite[] prerequisites;
    private Prerequisite.PrerequisiteOptions[] prerequisites_options;
    private DefaultDataAPI[] proficiencies;
    private ProficiencyChoices[] proficiency_choises;

    public Prerequisite[] getPrerequisites() {
        return prerequisites;
    }

    public Prerequisite.PrerequisiteOptions[] getPrerequisites_options() {
        return prerequisites_options;
    }

    public DefaultDataAPI[] getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(DefaultDataAPI[] proficiencies) {
        this.proficiencies = proficiencies;
    }

    public ProficiencyChoices[] getProficiency_choises() {
        return proficiency_choises;
    }

    public void setProficiency_choises(ProficiencyChoices[] proficiency_choises) {
        this.proficiency_choises = proficiency_choises;
    }

    public void setPrerequisites(Prerequisite[] prerequisites) {
        this.prerequisites = prerequisites;
    }

    public void setPrerequisites_options(Prerequisite.PrerequisiteOptions[] prerequisites_options) {
        this.prerequisites_options = prerequisites_options;
    }

    @Override
    public String toString() {
        return "MultiClasse{" +
                "prerequisites=" + Arrays.toString(prerequisites) +
                ", prerequisites_options=" + Arrays.toString(prerequisites_options) +
                ", proficiencies=" + Arrays.toString(proficiencies) +
                ", proficiency_choises=" + Arrays.toString(proficiency_choises) +
                '}';
    }
}


