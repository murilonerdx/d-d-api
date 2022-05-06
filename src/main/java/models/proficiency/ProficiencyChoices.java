package models.proficiency;

import models.utility.DefaultDataAPI;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * The type Proficiency choices.
 */
public class ProficiencyChoices {
    private BigDecimal choose;
    private String type;
    private DefaultDataAPI[] from;

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
        return "{" +
                "choose=" + choose +
                ", type='" + type + '\'' +
                ", from=" + Arrays.toString(from) +
                '}';
    }
}
