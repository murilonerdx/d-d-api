package models.monsters;

import models.feat.Feat;
import models.utility.RequestAPI;
import models.utility.RequestDefaultResource;
import models.utility.annotations.TypedForge;
import models.utility.path.ClassFeatType;

import java.io.IOException;

import static utils.APIProperties.getServer;

@TypedForge(name="monster", forge= String.class)
public class Monster extends RequestDefaultResource {
    /**
     * Get request default resource.
     *
     * @return the request default resource
     * @throws IOException the io exception
     */
    public static RequestDefaultResource get() throws IOException {
        String path = getServer() + ClassFeatType.MONSTER.getEndpoint().replace("{index}", "");
        return RequestAPI.GETs(path, Monster[].class);
    }

    /**
     * Gets index.
     *
     * @param index the index
     * @return the index
     * @throws IOException the io exception
     */
    public static MonsterFull getIndex(String index) throws IOException {
        String path = getServer() + ClassFeatType.MONSTER.endpointReplace(index);
        return (MonsterFull) RequestAPI.GET(path, MonsterFull.class);
    }
}
