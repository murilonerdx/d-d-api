package models.proficiency;

import com.google.gson.Gson;
import models.utility.DefaultDataAPI;
import models.utility.RequestAPI;
import models.utility.RequestDefaultResource;
import models.utility.path.CharacterDataType;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static utils.APIProperties.getServer;

/**
 * The type Proficiency.
 */
public class Proficiency extends DefaultDataAPI {
    private String type;
    private DefaultDataAPI[] races;
    private DefaultDataAPI reference;
    private DefaultDataAPI[] classes;

    /**
     * Get proficiency.
     *
     * @param url the url
     * @return the proficiency
     */
    public static Proficiency get(String url) {
        return new Gson().fromJson(new RestTemplate().getForEntity(url + CharacterDataType.PROFICIENCY.getEndpoint(), String.class).getBody(), Proficiency.class);
    }

    /**
     * Get request default resource.
     *
     * @return the request default resource
     * @throws IOException the io exception
     */
    public static RequestDefaultResource get() throws IOException {
        String path = getServer() + CharacterDataType.PROFICIENCY.getEndpoint();
        return RequestAPI.GETs(path, RequestDefaultResource[].class);
    }

    /**
     * Gets index.
     *
     * @param name the name
     * @return the index
     * @throws IOException the io exception
     */
    public static Proficiency getIndex(String name) throws IOException {
        String path = getServer() + CharacterDataType.PROFICIENCY.getEndpoint() + name;
        return (Proficiency) RequestAPI.GET(path, Proficiency.class);
    }

    /**
     * Search proficiency list.
     *
     * @param name the name
     * @return the list
     * @throws Exception the exception
     */
    public static List<DefaultDataAPI> searchProficiency(String name) throws Exception {
        List<DefaultDataAPI> dda = new ArrayList<>();
        Pattern pattern = Pattern.compile(name.toLowerCase());

        for (DefaultDataAPI result : get().getResults()) {
            Matcher match = pattern.matcher(result.getName().toLowerCase());
            while (match.find()) {
                dda.add(result);
            }
        }
        return dda;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Get races default data api [ ].
     *
     * @return the default data api [ ]
     */
    public DefaultDataAPI[] getRaces() {
        return races;
    }

    /**
     * Sets races.
     *
     * @param races the races
     */
    public void setRaces(DefaultDataAPI[] races) {
        this.races = races;
    }

    /**
     * Gets reference.
     *
     * @return the reference
     */
    public DefaultDataAPI getReference() {
        return reference;
    }

    /**
     * Sets reference.
     *
     * @param reference the reference
     */
    public void setReference(DefaultDataAPI reference) {
        this.reference = reference;
    }

    /**
     * Get classes default data api [ ].
     *
     * @return the default data api [ ]
     */
    public DefaultDataAPI[] getClasses() {
        return classes;
    }

    /**
     * Sets classes.
     *
     * @param classes the classes
     */
    public void setClasses(DefaultDataAPI[] classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Proficiency{" +
                "type='" + type + '\'' +
                ", races=" + Arrays.toString(races) +
                ", reference=" + reference +
                ", classes=" + Arrays.toString(classes) +
                '}';
    }
}
