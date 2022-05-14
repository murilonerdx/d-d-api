package models.equipament;

import models.equipament.enums.WeaponPropertyType;
import models.proficiency.Proficiency;
import models.spellcasting.SpellCastingType;
import models.utility.DefaultDataAPI;
import models.utility.RequestAPI;
import models.utility.annotations.TypedForge;
import models.utility.path.ClassEquipamentType;

import java.io.IOException;
import java.util.Arrays;

import static utils.APIProperties.getServer;

/**
 * The type Magic item.
 * These are the various magic items you can find in the game.
 */
@TypedForge(name="magic_item", forge= String.class)
public class MagicItem extends DefaultDataAPI {
    private String[] desc;
    private Object rarity;
    private DefaultDataAPI equipment_category;
    private DefaultDataAPI[] variants;
    private boolean variant;

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
     * Gets rarity.
     *
     * @return the rarity
     */
    public Object getRarity() {
        return rarity;
    }

    /**
     * Sets rarity.
     *
     * @param rarity the rarity
     */
    public void setRarity(Object rarity) {
        this.rarity = rarity;
    }

    /**
     * Gets equipment category.
     *
     * @return the equipment category
     */
    public DefaultDataAPI getEquipment_category() {
        return equipment_category;
    }

    /**
     * Sets equipment category.
     *
     * @param equipment_category the equipment category
     */
    public void setEquipment_category(DefaultDataAPI equipment_category) {
        this.equipment_category = equipment_category;
    }

    /**
     * Get variants default data api [ ].
     *
     * @return the default data api [ ]
     */
    public DefaultDataAPI[] getVariants() {
        return variants;
    }

    /**
     * Sets variants.
     *
     * @param variants the variants
     */
    public void setVariants(DefaultDataAPI[] variants) {
        this.variants = variants;
    }

    /**
     * Is variant boolean.
     *
     * @return the boolean
     */
    public boolean isVariant() {
        return variant;
    }

    /**
     * Sets variant.
     *
     * @param variant the variant
     */
    public void setVariant(boolean variant) {
        this.variant = variant;
    }

    /**
     * Gets index.
     *
     * @param name the name
     * @return the index
     * @throws IOException the io exception
     */
    public static MagicItem getIndex(String name) throws IOException {
        String path = getServer() + ClassEquipamentType.MAGIC_ITEMS.endpointReplace(name);
        return (MagicItem) RequestAPI.GET(path, MagicItem.class);
    }

    @Override
    public String toString() {
        return "MagicItem{" +
                "index=" + getIndex() +
                ", name=" + getName() +
                ", url=" + getUrl() +
                ", desc=" + Arrays.toString(desc) +
                ", rarity=" + rarity +
                ", equipment_category=" + equipment_category +
                ", variants=" + Arrays.toString(variants) +
                ", variant=" + variant +
                '}';
    }
}
