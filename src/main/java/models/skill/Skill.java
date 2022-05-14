package models.skill;

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
 * The type Skill.
 * Each ability covers a broad range of capabilities, including skills that a character or a monster can be proficient in.
 * A skill represents a specific aspect of an ability score, and an individual's proficiency in a skill demonstrates a focus on that aspect. [SRD p77]
 */
@TypedForge(name="skill", forge= SkillType.class)
public class Skill extends DefaultDataAPI {
    private String[] desc;
    private DefaultDataAPI ability_score;

    /**
     * Get skill.
     *
     * @param url the url
     * @return the skill
     */
    public static Skill get(String url) {
        return new Gson().fromJson(new RestTemplate().getForEntity(url + CharacterDataType.SKILL.getEndpoint(), String.class).getBody(), Skill.class);
    }

    /**
     * Get request default resource.
     *
     * @return the request default resource
     * @throws IOException the io exception
     */
    public static RequestDefaultResource get() throws IOException {
        String path = getServer() + CharacterDataType.SKILL.getEndpoint();
        return RequestAPI.GETs(path, Skill[].class);
    }

    /**
     * Gets index.
     *
     * @param index the index
     * @return the index
     * @throws IOException the io exception
     */
    public static Skill getIndex(SkillType index) throws IOException {
        String path = getServer() + CharacterDataType.SKILL.getEndpoint() + index.getDescription();
        return (Skill) RequestAPI.GET(path, Skill.class);
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
     * Gets ability score.
     *
     * @return the ability score
     */
    public DefaultDataAPI getAbility_score() {
        return ability_score;
    }

    /**
     * Sets ability score.
     *
     * @param ability_score the ability score
     */
    public void setAbility_score(DefaultDataAPI ability_score) {
        this.ability_score = ability_score;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "desc=" + Arrays.toString(desc) +
                ", ability_score=" + ability_score +
                '}';
    }
}
