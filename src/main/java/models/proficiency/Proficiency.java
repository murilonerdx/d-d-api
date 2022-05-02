package models.proficiency;

import models.languages.LanguageType;
import models.utility.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
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
        return new  com.google.gson.Gson().fromJson(new RestTemplate().getForEntity(url + CharacterDataType.PROFICIENCY.getEndpoint(), String.class).getBody(), Proficiency.class);
    }

    public static RequestDefaultResource get() throws IOException {
        String path = getServer() + CharacterDataType.PROFICIENCY.getEndpoint();
        return RequestAPI.GETs(path, RequestDefaultResource[].class);
    }

    public static Proficiency getIndex(String index) throws IOException {
        String path = getServer() + CharacterDataType.PROFICIENCY.getEndpoint() + index;
        return (Proficiency) RequestAPI.GET(path, Proficiency.class);
    }

    public static DefaultDataAPI searchProficiency(String name) throws Exception {
        return get().getResults().stream().filter(x -> Pattern.compile(name).matcher(x.getName()).find()).findFirst().get();
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
