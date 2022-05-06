package models.classe;

import models.utility.DefaultDataAPI;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * The type Prerequisite.
 */
class Prerequisite {
    private DefaultDataAPI ability_score;
    private BigDecimal minimum_score;

    /**
     * Instantiates a new Prerequisite.
     */
    public Prerequisite() {
    }

    /**
     * Gets ability score.
     *
     * @return the ability score
     */
    public DefaultDataAPI getAbility_score() {
        return ability_score;
    }

    /**
     * Sets ability score.
     *
     * @param ability_score the ability score
     */
    public void setAbility_score(DefaultDataAPI ability_score) {
        this.ability_score = ability_score;
    }

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

    @Override
    public String toString() {
        return "{" +
                "ability_score=" + ability_score +
                ", minimum_score=" + minimum_score +
                '}';
    }

    /**
     * The type Prerequisite options.
     */
    public static class PrerequisiteOptions {
        private BigDecimal choose;
        private String type;
        private DefaultDataAPI[] from;

        /**
         * Instantiates a new Prerequisite options.
         */
        public PrerequisiteOptions() {
        }

        /**
         * Gets choose.
         *
         * @return the choose
         */
        public BigDecimal getChoose() {
            return choose;
        }

        /**
         * Sets choose.
         *
         * @param choose the choose
         */
        public void setChoose(BigDecimal choose) {
            this.choose = choose;
        }

        /**
         * Gets type.
         *
         * @return the type
         */
        public String getType() {
            return type;
        }

        /**
         * Sets type.
         *
         * @param type the type
         */
        public void setType(String type) {
            this.type = type;
        }

        /**
         * Get from default data api [ ].
         *
         * @return the default data api [ ]
         */
        public DefaultDataAPI[] getFrom() {
            return from;
        }

        /**
         * Sets from.
         *
         * @param from the from
         */
        public void setFrom(DefaultDataAPI[] from) {
            this.from = from;
        }

        @Override
        public String toString() {
            return "PrerequisiteOptions{" +
                    "choose=" + choose +
                    ", type='" + type + '\'' +
                    ", from=" + Arrays.toString(from) +
                    '}';
        }
    }
}
