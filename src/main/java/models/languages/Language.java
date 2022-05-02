package models.languages;

import models.utility.APIResource;
import models.utility.CharacterDataType;
import models.utility.RequestAPI;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static utils.APIProperties.getServer;

public class Language extends APIResource {
    private String desc;
    private String type;
    private String script;
    private String[] typical_speakers;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public String[] getTypical_speakers() {
        return typical_speakers;
    }

    public void setTypical_speakers(String[] typical_speakers) {
        this.typical_speakers = typical_speakers;
    }

    public static Language get(String url){
        Language obj = new  com.google.gson.Gson().fromJson(new RestTemplate().getForEntity(url +"/api/ability-scores/", String.class).getBody(), Language.class);
        obj.setIsFetched(true);
        return obj;
    }

    public static List<Object> get() throws IOException {
        String path = getServer() + CharacterDataType.LANGUAGES.getEndpoint();
        return List.of(RequestAPI.GETs(path, Language[].class));
    }

    public static Language getIndex(LanguageType index) throws IOException {
        String path = getServer() + CharacterDataType.LANGUAGES.getEndpoint() + index.getDescription();
        Language obj = (Language) RequestAPI.GET(path, Language.class);

        obj.setIsFetched(true);
        return obj;
    }
}
