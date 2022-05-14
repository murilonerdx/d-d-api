package models.feat;


import models.ability.AbilityScore;
import models.classe.Classe;
import models.classe.ClasseType;
import models.levels.Level;
import models.skill.Skill;
import models.skill.SkillType;
import models.spellcasting.SpellCastingType;
import models.utility.DefaultDataAPI;
import models.utility.RequestAPI;
import models.utility.RequestDefaultResource;
import models.utility.annotations.TypedForge;
import models.utility.path.CharacterDataType;
import models.utility.path.ClassDataType;
import models.utility.path.ClassFeatType;
import models.utility.path.ClassLevelType;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static utils.APIProperties.getServer;

/**
 * The type Feat.
 * A feat is a boon a character can receive at level up instead of an ability score increase.
 */
@TypedForge(name="feat", forge= String.class)
public class Feat extends DefaultDataAPI {
    private String[] desc;
    private Prerequisites[] prerequisites;

    /**
     * Get desc string [ ].
     *
     * @return the string [ ]
     */
    public String[] getDesc() {
        return desc;
    }

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String[] desc) {
        this.desc = desc;
    }

    /**
     * Get request default resource.
     *
     * @return the request default resource
     * @throws IOException the io exception
     */
    public static RequestDefaultResource get() throws IOException {
        String path = getServer() + ClassFeatType.FEATS.getEndpoint().replace("{index}", "");
        return RequestAPI.GETs(path, Feat[].class);
    }

    /**
     * Gets index.
     *
     * @param index the index
     * @return the index
     * @throws IOException the io exception
     */
    public static Feat getIndex(String index) throws IOException {
        String path = getServer() + ClassFeatType.FEATS.endpointReplace(index);
        return (Feat) RequestAPI.GET(path, Feat.class);
    }

    @Override
    public String toString() {
        return "Feat{" +
                "index=" + getIndex() +
                ", name=" + getName() +
                ", url=" + getUrl() +
                ", desc=" + Arrays.toString(desc) +
                '}';
    }

    /**
     * Get prerequisites prerequisites [ ].
     *
     * @return the prerequisites [ ]
     */
    public Prerequisites[] getPrerequisites() {
        return prerequisites;
    }

    /**
     * Sets prerequisites.
     *
     * @param prerequisites the prerequisites
     */
    public void setPrerequisites(Prerequisites[] prerequisites) {
        this.prerequisites = prerequisites;
    }

    /**
     * The type Prerequisites.
     */
    static class Prerequisites {
        private AbilityScore ability_score;
        private BigDecimal minimum_score;

        /**
         * Gets minimum score.
         *
         * @return the minimum score
         */
        public BigDecimal getMinimum_score() {
            return minimum_score;
        }

        /**
         * Sets minimum score.
         *
         * @param minimum_score the minimum score
         */
        public void setMinimum_score(BigDecimal minimum_score) {
            this.minimum_score = minimum_score;
        }

        /**
         * Gets ability score.
         *
         * @return the ability score
         */
        public AbilityScore getAbility_score() {
            return ability_score;
        }

        /**
         * Sets ability score.
         *
         * @param ability_score the ability score
         */
        public void setAbility_score(AbilityScore ability_score) {
            this.ability_score = ability_score;
        }

        @Override
        public String toString() {
            return "Prerequisites{" +
                    "ability_score=" + ability_score +
                    ", minimum_score=" + minimum_score +
                    '}';
        }
    }

}
