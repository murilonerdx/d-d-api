package models.proficiency;

import models.utility.DefaultDataAPI;

import java.math.BigDecimal;
import java.util.Arrays;

public class ProficiencyChoices {
    private BigDecimal choose;
    private String type;
    private DefaultDataAPI[] from;

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
        return "ProficiencyChoices{" +
                "choose=" + choose +
                ", type='" + type + '\'' +
                ", from=" + Arrays.toString(from) +
                '}';
    }
}
