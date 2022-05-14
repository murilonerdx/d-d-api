package models.equipament;

import models.proficiency.Proficiency;
import models.utility.DefaultDataAPI;
import models.utility.RequestAPI;
import models.utility.RequestDefaultResource;
import models.utility.path.CharacterDataType;
import models.utility.path.ClassEquipamentType;

import java.io.IOException;
import java.util.Arrays;

import static utils.APIProperties.getServer;

public class EquipamentCategory extends DefaultDataAPI{
    private DefaultDataAPI[] equipment;

    public DefaultDataAPI[] getEquipment() {
        return equipment;
    }

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
    public static EquipamentCategory getIndex(String name) throws IOException {
        String path = getServer() + ClassEquipamentType.EQUIPAMENT_CATEGORIES.endpointReplace(name);
        return (EquipamentCategory) RequestAPI.GET(path, EquipamentCategory.class);
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
