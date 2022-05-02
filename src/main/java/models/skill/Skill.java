package models.skill;

import com.google.gson.Gson;
import models.utility.path.CharacterDataType;
import models.utility.DefaultDataAPI;
import models.utility.RequestAPI;
import models.utility.RequestDefaultResource;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;

import static utils.APIProperties.getServer;

public class Skill extends DefaultDataAPI {
    private String[] desc;
    private DefaultDataAPI ability_score;

    public String[] getDesc() {
        return desc;
    }

    public void setDesc(String[] desc) {
        this.desc = desc;
    }

    public DefaultDataAPI getAbility_score() {
        return ability_score;
    }

    public void setAbility_score(DefaultDataAPI ability_score) {
        this.ability_score = ability_score;
    }

    public static Skill get(String url){
        return new Gson().fromJson(new RestTemplate().getForEntity(url + CharacterDataType.SKILL.getEndpoint(), String.class).getBody(), Skill.class);
    }

    public static RequestDefaultResource get() throws IOException {
        String path = getServer() + CharacterDataType.SKILL.getEndpoint();
        return RequestAPI.GETs(path, Skill[].class);
    }

    public static Skill getIndex(SkillType index) throws IOException {
        String path = getServer() + CharacterDataType.SKILL.getEndpoint() + index.getDescription();
        return (Skill) RequestAPI.GET(path, Skill.class);
    }

    @Override
    public String toString() {
        return "Skill{" +
                "desc=" + Arrays.toString(desc) +
                ", ability_score=" + ability_score +
                '}';
    }
}
