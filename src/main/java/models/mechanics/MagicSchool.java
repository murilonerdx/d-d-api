package models.mechanics;

import models.mechanics.enums.DamageType;
import models.mechanics.enums.MagicSchoolType;
import models.utility.DefaultDataAPI;
import models.utility.RequestAPI;
import models.utility.annotations.TypedForge;
import models.utility.path.ClassGameMechanics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static utils.APIProperties.getServer;

/**
 * The type Magic school.
 * Academies of magic group spells into eight categories called schools of magic.
 * Scholars, particularly wizards, apply these categories to all spells, believing that all magic functions in essentially the same way, whether it derives from rigorous study or is bestowed by a deity.
 */
@TypedForge(name="magic_school", forge= MagicSchoolType.class)
public class MagicSchool extends DefaultDataAPI {
    private String desc;

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * Get list.
     *
     * @return the list
     * @throws IOException the io exception
     */
    public static List<MagicSchool> get() throws IOException {
        List<MagicSchool> damage_list = new ArrayList<>();
        MagicSchoolType[] values = MagicSchoolType.values();

        for (MagicSchoolType type : values) {
            MagicSchool index = getIndex(type);
            damage_list.add(index);
        }

        return damage_list;
    }

    /**
     * Gets index.
     *
     * @param type the type
     * @return the index
     * @throws IOException the io exception
     */
    public static MagicSchool getIndex(MagicSchoolType type) throws IOException {
        String path = getServer() + ClassGameMechanics.MAGIC_SCHOOLS.endpointReplace(type.name());
        return (MagicSchool) RequestAPI.GET(path, MagicSchool.class);
    }

    @Override
    public String toString() {
        return "MagicSchool{" +
                "index=" + getIndex() +
                ", name=" + getName() +
                ", url=" + getUrl() +
                ", desc='" + desc + '\'' +
                '}';
    }
}
