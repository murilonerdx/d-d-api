package models.ability;

import com.fasterxml.jackson.annotation.JsonProperty;
import models.utility.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static utils.APIProperties.getServer;

public class AbilityScore extends DefaultDataAPI {
    private String full_name;
    private String[] desc;

    private ArrayList<DefaultDataAPI> skills;

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

    public ArrayList<DefaultDataAPI> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<DefaultDataAPI> skill) {
        this.skills = skill;
    }

    public static AbilityScore get(String url){
        return new  com.google.gson.Gson().fromJson(new RestTemplate().getForEntity(url + CharacterDataType.ABILITYSCORE.getEndpoint(), String.class).getBody(), AbilityScore.class);
    }

    public static RequestDefaultResource get() throws IOException {
        String path = getServer() + CharacterDataType.ABILITYSCORE.getEndpoint();
        return RequestAPI.GETs(path, RequestDefaultResource[].class);
    }

    public static AbilityScore getIndex(AbilityScoreType index) throws IOException {
        String path = getServer() + CharacterDataType.ABILITYSCORE.getEndpoint() + index.getDescription();
        return (AbilityScore) RequestAPI.GET(path, AbilityScore.class);
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
