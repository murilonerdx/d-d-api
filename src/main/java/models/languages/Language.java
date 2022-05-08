package models.languages;

import com.google.gson.Gson;
import models.utility.annotations.TypedForge;
import models.utility.DefaultDataAPI;
import models.utility.RequestAPI;
import models.utility.RequestDefaultResource;
import models.utility.path.CharacterDataType;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;

import static utils.APIProperties.getServer;

/**
 * The type Language.
 */
@TypedForge(name="language", forge= LanguageType.class)
public class Language extends DefaultDataAPI {
    private String desc;
    private String type;
    private String script;
    private String[] typical_speakers;

    /**
     * Get language.
     *
     * @param url the url
     * @return the language
     */
    public static Language get(String url) {
        return new Gson().fromJson(new RestTemplate().getForEntity(url + CharacterDataType.LANGUAGES.getEndpoint(), String.class).getBody(), Language.class);
    }

    /**
     * Get request default resource.
     *
     * @return the request default resource
     * @throws IOException the io exception
     */
    public static RequestDefaultResource get() throws IOException {
        String path = getServer() + CharacterDataType.LANGUAGES.getEndpoint();
        return RequestAPI.GETs(path, RequestDefaultResource[].class);
    }

    /**
     * Gets index.
     *
     * @param index the index
     * @return the index
     * @throws IOException the io exception
     */
    public static Language getIndex(LanguageType index) throws IOException {
        String path = getServer() + CharacterDataType.LANGUAGES.getEndpoint() + index.getDescription();
        return (Language) RequestAPI.GET(path, Language.class);
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
     * Gets script.
     *
     * @return the script
     */
    public String getScript() {
        return script;
    }

    /**
     * Sets script.
     *
     * @param script the script
     */
    public void setScript(String script) {
        this.script = script;
    }

    /**
     * Get typical speakers string [ ].
     *
     * @return the string [ ]
     */
    public String[] getTypical_speakers() {
        return typical_speakers;
    }

    /**
     * Sets typical speakers.
     *
     * @param typical_speakers the typical speakers
     */
    public void setTypical_speakers(String[] typical_speakers) {
        this.typical_speakers = typical_speakers;
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
