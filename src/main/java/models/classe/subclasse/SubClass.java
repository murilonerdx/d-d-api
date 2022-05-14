package models.classe.subclasse;

import models.utility.annotations.TypedForge;
import models.classe.ClasseType;
import models.utility.RequestAPI;
import models.utility.RequestDefaultResource;
import models.utility.path.ClassDataType;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static utils.APIProperties.getServer;

/**
 * The type Sub class.
 */
@TypedForge(name="sub_classe", forge= ClasseType.class)
public class SubClass extends RequestDefaultResource {
    /**
     * Get list.
     *
     * @return the list
     * @throws IOException the io exception
     */
    public static List<SubClass> get() throws IOException {
        List<SubClass> sub_class_list = new ArrayList<>();
        ClasseType[] values = ClasseType.values();

        for (ClasseType type : values) {
            SubClass index = getIndex(type);
            sub_class_list.add(index);
        }

        return sub_class_list;
    }

    /**
     * Gets index.
     *
     * @param type the type
     * @return the index
     * @throws IOException the io exception
     */
    public static SubClass getIndex(ClasseType type) throws IOException {
        String path = getServer() + ClassDataType.SUBCLASS.endpointReplace(type.name());
        return (SubClass) RequestAPI.GET(path, SubClass.class);
    }
}
