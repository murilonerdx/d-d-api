package models.alignment;

import models.utility.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

import static utils.APIProperties.getServer;

public class Alignment extends DefaultDataAPI {
    private String abbreviation;
    private String desc;

    public Alignment() {
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public static Alignment get(String url){
        return new  com.google.gson.Gson().fromJson(new RestTemplate().getForEntity(url + CharacterDataType.ALIGNMENT.getEndpoint(), String.class).getBody(), Alignment.class);
    }

    public static RequestDefaultResource get() throws IOException {
        String path = getServer() + CharacterDataType.ALIGNMENT.getEndpoint();
        return RequestAPI.GETs(path, RequestDefaultResource[].class);
    }

    public static Alignment getIndex(AlignmentType index) throws IOException {
        String path = getServer() + CharacterDataType.ALIGNMENT.getEndpoint() + index.getDescription();
        return (Alignment) RequestAPI.GET(path, Alignment.class);
    }

    @Override
    public String toString() {
        return "Alignment{" +
                "abbreviation='" + abbreviation + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
