package models.proficiency;

import com.google.gson.Gson;
import models.utility.*;
import models.utility.path.CharacterDataType;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static utils.APIProperties.getServer;

public class Proficiency extends DefaultDataAPI {
    private String type;
    private DefaultDataAPI[] races;
    private DefaultDataAPI reference;
    private DefaultDataAPI[] classes;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DefaultDataAPI[] getRaces() {
        return races;
    }

    public void setRaces(DefaultDataAPI[] races) {
        this.races = races;
    }

    public DefaultDataAPI getReference() {
        return reference;
    }

    public void setReference(DefaultDataAPI reference) {
        this.reference = reference;
    }

    public DefaultDataAPI[] getClasses() {
        return classes;
    }

    public void setClasses(DefaultDataAPI[] classes) {
        this.classes = classes;
    }

    public static Proficiency get(String url){
        return new Gson().fromJson(new RestTemplate().getForEntity(url + CharacterDataType.PROFICIENCY.getEndpoint(), String.class).getBody(), Proficiency.class);
    }

    public static RequestDefaultResource get() throws IOException {
        String path = getServer() + CharacterDataType.PROFICIENCY.getEndpoint();
        return RequestAPI.GETs(path, RequestDefaultResource[].class);
    }

    public static Proficiency getIndex(String name) throws IOException {
        String path = getServer() + CharacterDataType.PROFICIENCY.getEndpoint() + name;
        return (Proficiency) RequestAPI.GET(path, Proficiency.class);
    }

    public static List<DefaultDataAPI> searchProficiency(String name) throws Exception {
        List<DefaultDataAPI> dda = new ArrayList<>();
        Pattern pattern = Pattern.compile(name.toLowerCase());

        for (DefaultDataAPI result : get().getResults()) {
            Matcher match = pattern.matcher(result.getName().toLowerCase());
            while(match.find()){
                dda.add(result);
            }
        }
        return dda;
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
