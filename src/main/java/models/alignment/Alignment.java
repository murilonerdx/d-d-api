package models.alignment;

import com.google.gson.Gson;
import models.utility.annotations.TypedForge;
import models.utility.DefaultDataAPI;
import models.utility.RequestAPI;
import models.utility.RequestDefaultResource;
import models.utility.path.CharacterDataType;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

import static utils.APIProperties.getServer;

/**
 * The type Alignment.
 *  * A typical creature in the game world has an alignment, which broadly describes its moral and personal attitudes.
 *  * Alignment is a combination of two factors: one identifies morality (good, evil, or neutral), and the other describes attitudes toward society and order (lawful, chaotic, or neutral).
 *  * Thus, nine distinct alignments define the possible combinations.[SRD p58]
 */
@TypedForge(name="alignment", forge= AlignmentType.class)
public class Alignment extends DefaultDataAPI {
    private String abbreviation;
    private String desc;

    /**
     * Instantiates a new Alignment.
     */
    public Alignment() {
    }

    /**
     * Get alignment.
     *
     * @param url the url
     * @return the alignment
     */
    public static Alignment get(String url) {
        return new Gson().fromJson(new RestTemplate().getForEntity(url + CharacterDataType.ALIGNMENT.getEndpoint(), String.class).getBody(), Alignment.class);
    }

    /**
     * Get request default resource.
     *
     * @return the request default resource
     * @throws IOException the io exception
     */
    public static RequestDefaultResource get() throws IOException {
        String path = getServer() + CharacterDataType.ALIGNMENT.getEndpoint();
        return RequestAPI.GETs(path, RequestDefaultResource[].class);
    }

    /**
     * Gets index.
     *
     * @param index the index
     * @return the index
     * @throws IOException the io exception
     */
    public static Alignment getIndex(AlignmentType index) throws IOException {
        String path = getServer() + CharacterDataType.ALIGNMENT.getEndpoint() + index.getDescription();
        return (Alignment) RequestAPI.GET(path, Alignment.class);
    }

    /**
     * Gets abbreviation.
     *
     * @return the abbreviation
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Sets abbreviation.
     *
     * @param abbreviation the abbreviation
     */
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

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

    @Override
    public String toString() {
        return "Alignment{" +
                "abbreviation='" + abbreviation + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
