package models.ability;

import com.google.gson.Gson;
import models.utility.DefaultDataAPI;
import models.utility.RequestAPI;
import models.utility.RequestDefaultResource;
import models.utility.path.CharacterDataType;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static utils.APIProperties.getServer;

/**
 * The type Ability score.
 */
public class AbilityScore extends DefaultDataAPI {
    private String full_name;
    private String[] desc;
    private ArrayList<DefaultDataAPI> skills;

    /**
     * Instantiates a new Ability score.
     */
    public AbilityScore() {
    }

    /**
     * Get ability score.
     *
     * @param url the url
     * @return the ability score
     */
    public static AbilityScore get(String url) {
        return new Gson().fromJson(new RestTemplate().getForEntity(url + CharacterDataType.ABILITYSCORE.getEndpoint(), String.class).getBody(), AbilityScore.class);
    }

    /**
     * Get request default resource.
     *
     * @return the request default resource
     * @throws IOException the io exception
     */
    public static RequestDefaultResource get() throws IOException {
        String path = getServer() + CharacterDataType.ABILITYSCORE.getEndpoint();
        return RequestAPI.GETs(path, RequestDefaultResource[].class);
    }

    /**
     * Gets index.
     *
     * @param index the index
     * @return the index
     * @throws IOException the io exception
     */
    public static AbilityScore getIndex(AbilityScoreType index) throws IOException {
        String path = getServer() + CharacterDataType.ABILITYSCORE.getEndpoint() + index.getDescription();
        return (AbilityScore) RequestAPI.GET(path, AbilityScore.class);
    }

    /**
     * Get desc string [ ].
     *
     * @return the string [ ]
     */
    public String[] getDesc() {
        return desc;
    }

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String[] desc) {
        this.desc = desc;
    }

    /**
     * Gets full name.
     *
     * @return the full name
     */
    public String getFull_name() {
        return full_name;
    }

    /**
     * Sets full name.
     *
     * @param full_name the full name
     */
    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    /**
     * Gets skills.
     *
     * @return the skills
     */
    public ArrayList<DefaultDataAPI> getSkills() {
        return skills;
    }

    /**
     * Sets skills.
     *
     * @param skill the skill
     */
    public void setSkills(ArrayList<DefaultDataAPI> skill) {
        this.skills = skill;
    }

    @Override
    public String toString() {
        return "AbilityScore{" +
                "full_name='" + full_name + '\'' +
                ", desc=" + Arrays.toString(desc) +
                ", skills=" + skills +
                '}';
    }
}
