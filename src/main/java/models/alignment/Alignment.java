package models.alignment;

import models.languages.Language;
import models.utility.APIResource;
import models.utility.CharacterDataType;
import models.utility.RequestAPI;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

import static utils.APIProperties.getServer;

public class Alignment extends APIResource {
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
        Alignment obj = new  com.google.gson.Gson().fromJson(new RestTemplate().getForEntity(url +"/api/ability-scores/", String.class).getBody(), Alignment.class);
        obj.setIsFetched(true);
        return obj;
    }

    public static List<Object> get() throws IOException {
        String path = getServer() + CharacterDataType.ALIGNMENT.getEndpoint();
        return List.of(RequestAPI.GETs(path, Alignment[].class));
    }

    public static Alignment getIndex(AlignmentType index) throws IOException {
        String path = getServer() + CharacterDataType.ALIGNMENT.getEndpoint() + index.getDescription();
        Alignment obj = (Alignment) RequestAPI.GET(path, Alignment.class);

        obj.setIsFetched(true);
        return obj;
    }

}
