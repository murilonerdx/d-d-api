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

/**
 * The type Equipment.
 * Opportunities abound to find treasure, equipment, weapons, armor, and more in the dungeons you explore.
 * Normally, you can sell your treasures and trinkets when you return to a town or other settlement, provided that you can find buyers and merchants interested in your loot.
 */
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
     * Gets weapon category.
     *
     * @return the weapon category
     */
    public String getWeapon_category() {
        return weapon_category;
    }

    /**
     * Sets weapon category.
     *
     * @param weapon_category the weapon category
     */
    public void setWeapon_category(String weapon_category) {
        this.weapon_category = weapon_category;
    }

    /**
     * Gets weapon range.
     *
     * @return the weapon range
     */
    public String getWeapon_range() {
        return weapon_range;
    }

    /**
     * Sets weapon range.
     *
     * @param weapon_range the weapon range
     */
    public void setWeapon_range(String weapon_range) {
        this.weapon_range = weapon_range;
    }

    /**
     * Gets category range.
     *
     * @return the category range
     */
    public String getCategory_range() {
        return category_range;
    }

    /**
     * Sets category range.
     *
     * @param category_range the category range
     */
    public void setCategory_range(String category_range) {
        this.category_range = category_range;
    }

    /**
     * Gets range.
     *
     * @return the range
     */
    public Object getRange() {
        return range;
    }

    /**
     * Sets range.
     *
     * @param range the range
     */
    public void setRange(Object range) {
        this.range = range;
    }

    /**
     * Gets damage.
     *
     * @return the damage
     */
    public Damage getDamage() {
        return damage;
    }

    /**
     * Sets damage.
     *
     * @param damage the damage
     */
    public void setDamage(Damage damage) {
        this.damage = damage;
    }

    /**
     * Gets two handed damage.
     *
     * @return the two handed damage
     */
    public TwoHandedDamage getTwo_handed_damage() {
        return two_handed_damage;
    }

    /**
     * Sets two handed damage.
     *
     * @param two_handed_damage the two handed damage
     */
    public void setTwo_handed_damage(TwoHandedDamage two_handed_damage) {
        this.two_handed_damage = two_handed_damage;
    }

    /**
     * Get properties default data api [ ].
     *
     * @return the default data api [ ]
     */
    public DefaultDataAPI[] getProperties() {
        return properties;
    }

    /**
     * Sets properties.
     *
     * @param properties the properties
     */
    public void setProperties(DefaultDataAPI[] properties) {
        this.properties = properties;
    }

    /**
     * Gets weight.
     *
     * @return the weight
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * Sets weight.
     *
     * @param weight the weight
     */
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

    /**
     * The type Coast.
     */
    static class Coast{
        private BigDecimal quantity;
        private String unit;

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
         * Gets unit.
         *
         * @return the unit
         */
        public String getUnit() {
            return unit;
        }

        /**
         * Sets unit.
         *
         * @param unit the unit
         */
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

    /**
     * The type Two handed damage.
     */
    static class TwoHandedDamage{
        private String damage_dice;
        private DefaultDataAPI damage_type;

        /**
         * Gets damage dice.
         *
         * @return the damage dice
         */
        public String getDamage_dice() {
            return damage_dice;
        }

        /**
         * Sets damage dice.
         *
         * @param damage_dice the damage dice
         */
        public void setDamage_dice(String damage_dice) {
            this.damage_dice = damage_dice;
        }

        /**
         * Gets damage type.
         *
         * @return the damage type
         */
        public DefaultDataAPI getDamage_type() {
            return damage_type;
        }

        /**
         * Sets damage type.
         *
         * @param damage_type the damage type
         */
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
