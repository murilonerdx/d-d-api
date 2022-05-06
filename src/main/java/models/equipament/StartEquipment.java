package models.equipament;

import models.utility.DefaultDataAPI;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * The type Start equipment.
 */
public class StartEquipment {
    private BigDecimal quantity;
    private DefaultDataAPI equipment;

    /**
     * Gets quantity.
     *
     * @return the quantity
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets quantity.
     *
     * @param quantity the quantity
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    /**
     * Gets equipment.
     *
     * @return the equipment
     */
    public DefaultDataAPI getEquipment() {
        return equipment;
    }

    /**
     * Sets equipment.
     *
     * @param equipment the equipment
     */
    public void setEquipment(DefaultDataAPI equipment) {
        this.equipment = equipment;
    }

    /**
     * The type Starting equipment options.
     */
    public static class StartingEquipmentOptions {
        private BigDecimal choose;
        private String type;
        private ArrayList<Object> from;

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
         * Gets from.
         *
         * @return the from
         */
        public ArrayList<Object> getFrom() {
            return from;
        }

        /**
         * Sets from.
         *
         * @param from the from
         */
        public void setFrom(ArrayList<Object> from) {
            this.from = from;
        }

        @Override
        public String toString() {
            return "StartingEquipmentOptions{" +
                    "choose=" + choose +
                    ", type='" + type + '\'' +
                    ", from=" + from +
                    '}';
        }
    }
}
