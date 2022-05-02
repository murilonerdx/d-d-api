package models.languages;

import com.google.gson.Gson;
import models.utility.*;
import models.utility.path.CharacterDataType;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;

import static utils.APIProperties.getServer;

public class Language extends DefaultDataAPI {
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
        return new Gson().fromJson(new RestTemplate().getForEntity(url + CharacterDataType.LANGUAGES.getEndpoint(), String.class).getBody(), Language.class);
    }

    public static RequestDefaultResource get() throws IOException {
        String path = getServer() + CharacterDataType.LANGUAGES.getEndpoint();
        return RequestAPI.GETs(path, RequestDefaultResource[].class);
    }

    public static Language getIndex(LanguageType index) throws IOException {
        String path = getServer() + CharacterDataType.LANGUAGES.getEndpoint() + index.getDescription();
        return (Language) RequestAPI.GET(path, Language.class);
    }

    @Override
    public String toString() {
        return "Language{" +
                "desc='" + desc + '\'' +
                ", type='" + type + '\'' +
                ", script='" + script + '\'' +
                ", typical_speakers=" + Arrays.toString(typical_speakers) +
                '}';
    }


}
