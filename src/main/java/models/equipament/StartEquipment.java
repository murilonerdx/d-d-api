package models.equipament;

import models.utility.DefaultDataAPI;

import java.math.BigDecimal;
import java.util.ArrayList;

public class StartEquipment {
    private BigDecimal quantity;
    private DefaultDataAPI equipment;

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public DefaultDataAPI getEquipment() {
        return equipment;
    }

    public void setEquipment(DefaultDataAPI equipment) {
        this.equipment = equipment;
    }

    public static class StartingEquipmentOptions{
        private BigDecimal choose;
        private String type;
        private ArrayList<Object> from;

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

        public ArrayList<Object> getFrom() {
            return from;
        }

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
