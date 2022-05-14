package models.equipament;

import models.ability.AbilityScore;
import models.ability.AbilityScoreType;
import models.mechanics.enums.ConditionType;
import models.utility.DefaultDataAPI;
import models.utility.RequestAPI;
import models.utility.RequestDefaultResource;
import models.utility.annotations.TypedForge;
import models.utility.path.CharacterDataType;
import models.utility.path.ClassEquipamentType;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

import static utils.APIProperties.getServer;

@TypedForge(name="equipment", forge= String.class)
public class Equipment {
    private String desc[];
    private String weapon_category;
    private String weapon_range;
    private String category_range;
    private Object range;
    private Damage damage;
    private TwoHandedDamage two_handed_damage;
    private DefaultDataAPI[] properties;
    private BigDecimal weight;

    public String[] getDesc() {
        return desc;
    }

    public void setDesc(String[] desc) {
        this.desc = desc;
    }

    public String getWeapon_category() {
        return weapon_category;
    }

    public void setWeapon_category(String weapon_category) {
        this.weapon_category = weapon_category;
    }

    public String getWeapon_range() {
        return weapon_range;
    }

    public void setWeapon_range(String weapon_range) {
        this.weapon_range = weapon_range;
    }

    public String getCategory_range() {
        return category_range;
    }

    public void setCategory_range(String category_range) {
        this.category_range = category_range;
    }

    public Object getRange() {
        return range;
    }

    public void setRange(Object range) {
        this.range = range;
    }

    public Damage getDamage() {
        return damage;
    }

    public void setDamage(Damage damage) {
        this.damage = damage;
    }

    public TwoHandedDamage getTwo_handed_damage() {
        return two_handed_damage;
    }

    public void setTwo_handed_damage(TwoHandedDamage two_handed_damage) {
        this.two_handed_damage = two_handed_damage;
    }

    public DefaultDataAPI[] getProperties() {
        return properties;
    }

    public void setProperties(DefaultDataAPI[] properties) {
        this.properties = properties;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * Get request default resource.
     *
     * @return the request default resource
     * @throws IOException the io exception
     */
    public static RequestDefaultResource get() throws IOException {
        String path = getServer() + ClassEquipamentType.EQUIPAMENT_CATEGORIES.getEndpoint().replace("{index}","");
        return RequestAPI.GETs(path, RequestDefaultResource[].class);
    }

    @Override
    public String toString() {
        return "Equipament{" +
                "desc=" + Arrays.toString(desc) +
                ", weapon_category='" + weapon_category + '\'' +
                ", weapon_range='" + weapon_range + '\'' +
                ", category_range='" + category_range + '\'' +
                ", range=" + range +
                ", damage=" + damage +
                ", two_handed_damage=" + two_handed_damage +
                ", properties=" + Arrays.toString(properties) +
                ", weight=" + weight +
                '}';
    }

    static class Coast{
        private BigDecimal quantity;
        private String unit;

        public BigDecimal getQuantity() {
            return quantity;
        }

        public void setQuantity(BigDecimal quantity) {
            this.quantity = quantity;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        @Override
        public String toString() {
            return "Coast{" +
                    "quantity=" + quantity +
                    ", unit='" + unit + '\'' +
                    '}';
        }
    }

    static class TwoHandedDamage{
        private String damage_dice;
        private DefaultDataAPI damage_type;

        public String getDamage_dice() {
            return damage_dice;
        }

        public void setDamage_dice(String damage_dice) {
            this.damage_dice = damage_dice;
        }

        public DefaultDataAPI getDamage_type() {
            return damage_type;
        }

        public void setDamage_type(DefaultDataAPI damage_type) {
            this.damage_type = damage_type;
        }

        @Override
        public String toString() {
            return "TwoHandedDamage{" +
                    "damage_dice='" + damage_dice + '\'' +
                    ", damage_type=" + damage_type +
                    '}';
        }
    }
}
