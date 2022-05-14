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

public class Feat extends DefaultDataAPI {
    private String[] desc;
    private Prerequisites[] prerequisites;

    public String[] getDesc() {
        return desc;
    }

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

    public Prerequisites[] getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(Prerequisites[] prerequisites) {
        this.prerequisites = prerequisites;
    }

    static class Prerequisites {
        private AbilityScore ability_score;
        private BigDecimal minimum_score;

        public BigDecimal getMinimum_score() {
            return minimum_score;
        }

        public void setMinimum_score(BigDecimal minimum_score) {
            this.minimum_score = minimum_score;
        }

        public AbilityScore getAbility_score() {
            return ability_score;
        }

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
