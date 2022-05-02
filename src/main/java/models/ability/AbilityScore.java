package models.ability;

import models.languages.Language;
import models.skill.Skill;
import models.utility.APIResource;
import models.utility.CharacterDataType;
import models.utility.RequestAPI;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static utils.APIProperties.getServer;

public class AbilityScore extends APIResource{
    private String full_name;
    private String[] desc;
    private ArrayList<Skill> skills;

    public AbilityScore() {
    }

    public String[] getDesc() {
        return desc;
    }

    public void setDesc(String[] desc) {
        this.desc = desc;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skill) {
        this.skills = skill;
    }

    public static AbilityScore get(String url){
        AbilityScore obj = new  com.google.gson.Gson().fromJson(new RestTemplate().getForEntity(url +"/api/ability-scores/", String.class).getBody(), AbilityScore.class);
        obj.setIsFetched(true);
        return obj;
    }

    public static AbilityScore getIndex(AbilityScoreType index) throws IOException {
        String path = getServer() + CharacterDataType.ABILITYSCORE.getEndpoint() + index.getDescription();
        AbilityScore obj = (AbilityScore) RequestAPI.GET(path, AbilityScore.class);

        obj.setIsFetched(true);
        return obj;
    }

    public static List<Object> get() throws IOException {
        String path = getServer() + CharacterDataType.ABILITYSCORE.getEndpoint();
        return List.of(RequestAPI.GETs(path, AbilityScore[].class));
    }

}
