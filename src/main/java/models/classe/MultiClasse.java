package models.classe;

import models.proficiency.ProficiencyChoices;
import models.utility.DefaultDataAPI;

import java.util.Arrays;

/**
 * The type Multi classe.
 */
class MultiClasse {
    private Prerequisite[] prerequisites;
    private Prerequisite.PrerequisiteOptions[] prerequisite_options;
    private DefaultDataAPI[] proficiencies;
    private ProficiencyChoices[] proficiency_choices;

    /**
     * Get prerequisites prerequisite [ ].
     *
     * @return the prerequisite [ ]
     */
    public Prerequisite[] getPrerequisites() {
        return prerequisites;
    }

    /**
     * Sets prerequisites.
     *
     * @param prerequisites the prerequisites
     */
    public void setPrerequisites(Prerequisite[] prerequisites) {
        this.prerequisites = prerequisites;
    }

    /**
     * Get prerequisite options prerequisite . prerequisite options [ ].
     *
     * @return the prerequisite . prerequisite options [ ]
     */
    public Prerequisite.PrerequisiteOptions[] getPrerequisite_options() {
        return prerequisite_options;
    }

    /**
     * Sets prerequisite options.
     *
     * @param prerequisite_options the prerequisite options
     */
    public void setPrerequisite_options(Prerequisite.PrerequisiteOptions[] prerequisite_options) {
        this.prerequisite_options = prerequisite_options;
    }

    /**
     * Get proficiencies default data api [ ].
     *
     * @return the default data api [ ]
     */
    public DefaultDataAPI[] getProficiencies() {
        return proficiencies;
    }

    /**
     * Sets proficiencies.
     *
     * @param proficiencies the proficiencies
     */
    public void setProficiencies(DefaultDataAPI[] proficiencies) {
        this.proficiencies = proficiencies;
    }

    /**
     * Get proficiency choises proficiency choices [ ].
     *
     * @return the proficiency choices [ ]
     */
    public ProficiencyChoices[] getProficiency_choises() {
        return proficiency_choices;
    }

    /**
     * Sets proficiency choises.
     *
     * @param proficiency_choices the proficiency choices
     */
    public void setProficiency_choises(ProficiencyChoices[] proficiency_choices) {
        this.proficiency_choices = proficiency_choices;
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


