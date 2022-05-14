package models.equipament;

import models.equipament.enums.WeaponPropertyType;
import models.proficiency.Proficiency;
import models.spellcasting.SpellCastingType;
import models.utility.DefaultDataAPI;
import models.utility.RequestAPI;
import models.utility.annotations.TypedForge;
import models.utility.path.CharacterDataType;
import models.utility.path.ClassEquipamentType;

import java.io.IOException;
import java.util.Arrays;

import static utils.APIProperties.getServer;

@TypedForge(name="weapon_property", forge=WeaponPropertyType.class)
public class WeaponProperty extends DefaultDataAPI {
    private String[] desc;

    @Override
    public String getIndex() {
        return super.getIndex();
    }

    @Override
    public void setIndex(String index) {
        super.setIndex(index);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getUrl() {
        return super.getUrl();
    }

    @Override
    public void setUrl(String url) {
        super.setUrl(url);
    }

    public String[] getDesc() {
        return desc;
    }

    public void setDesc(String[] desc) {
        this.desc = desc;
    }

    /**
     * Gets index.
     *
     * @param name the name
     * @return the index
     * @throws IOException the io exception
     */
    public static WeaponProperty getIndex(WeaponPropertyType name) throws IOException {
        String path = getServer() + ClassEquipamentType.WEAPON_PROPERTIES.endpointReplace(name.toString());
        return (WeaponProperty) RequestAPI.GET(path, WeaponProperty.class);
    }

    @Override
    public String toString() {
        return "WeaponProperty{" +
                "index=" + getIndex() +
                ", name=" + getName() +
                ", url=" + getUrl() +
                ", desc=" + Arrays.toString(desc) +
                '}';
    }
}
