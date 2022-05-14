package models.equipament;

import models.equipament.enums.WeaponPropertyType;
import models.proficiency.Proficiency;
import models.utility.DefaultDataAPI;
import models.utility.RequestAPI;
import models.utility.path.ClassEquipamentType;

import java.io.IOException;
import java.util.Arrays;

import static utils.APIProperties.getServer;

public class MagicItem extends DefaultDataAPI {
    private String[] desc;
    private Object rarity;
    private DefaultDataAPI equipment_category;
    private DefaultDataAPI[] variants;
    private boolean variant;

    public String[] getDesc() {
        return desc;
    }

    public void setDesc(String[] desc) {
        this.desc = desc;
    }

    public Object getRarity() {
        return rarity;
    }

    public void setRarity(Object rarity) {
        this.rarity = rarity;
    }

    public DefaultDataAPI getEquipment_category() {
        return equipment_category;
    }

    public void setEquipment_category(DefaultDataAPI equipment_category) {
        this.equipment_category = equipment_category;
    }

    public DefaultDataAPI[] getVariants() {
        return variants;
    }

    public void setVariants(DefaultDataAPI[] variants) {
        this.variants = variants;
    }

    public boolean isVariant() {
        return variant;
    }

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
