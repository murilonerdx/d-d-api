package models.equipament;

import models.utility.DefaultDataAPI;
import models.utility.RequestAPI;
import models.utility.annotations.TypedForge;
import models.utility.path.ClassEquipamentType;

import java.io.IOException;
import java.util.Arrays;

import static utils.APIProperties.getServer;

/**
 * The type Equipament category.
 * These are the categories that various equipment fall under.
 */
@TypedForge(name="equipment_category", forge= String.class)
public class EquipmentCategory extends DefaultDataAPI{
    private DefaultDataAPI[] equipment;

    /**
     * Get equipment default data api [ ].
     *
     * @return the default data api [ ]
     */
    public DefaultDataAPI[] getEquipment() {
        return equipment;
    }

    /**
     * Sets equipment.
     *
     * @param equipment the equipment
     */
    public void setEquipment(DefaultDataAPI[] equipment) {
        this.equipment = equipment;
    }

    /**
     * Gets index.
     *
     * @param name the name
     * @return the index
     * @throws IOException the io exception
     */
    public static EquipmentCategory getIndex(String name) throws IOException {
        String path = getServer() + ClassEquipamentType.EQUIPAMENT_CATEGORIES.endpointReplace(name);
        return (EquipmentCategory) RequestAPI.GET(path, EquipmentCategory.class);
    }

    @Override
    public String toString() {
        return "EquipamentCategory{" +
                "index=" + getIndex() +
                ", name=" + getName() +
                ", url=" + getUrl() +
                ", equipment=" + Arrays.toString(equipment) +
                '}';
    }
}
