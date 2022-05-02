package models.classe;

import models.utility.DefaultDataAPI;

import java.math.BigDecimal;
import java.util.Arrays;

class Prerequisite {
    private DefaultDataAPI ability_score;
    private BigDecimal minimum_score;

    public Prerequisite() {
    }

    public DefaultDataAPI getAbility_score() {
        return ability_score;
    }

    public void setAbility_score(DefaultDataAPI ability_score) {
        this.ability_score = ability_score;
    }

    public BigDecimal getMinimum_score() {
        return minimum_score;
    }

    public void setMinimum_score(BigDecimal minimum_score) {
        this.minimum_score = minimum_score;
    }

    @Override
    public String toString() {
        return "Prerequisite{" +
                "ability_score=" + ability_score +
                ", minimum_score=" + minimum_score +
                '}';
    }

    public static class PrerequisiteOptions{
        private BigDecimal choose;
        private String type;
        private DefaultDataAPI[] from;

        public PrerequisiteOptions() {
        }

        public BigDecimal getChoose() {
            return choose;
        }

        public void setChoose(BigDecimal choose) {
            this.choose = choose;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public DefaultDataAPI[] getFrom() {
            return from;
        }

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
