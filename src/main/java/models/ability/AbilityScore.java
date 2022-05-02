package models.ability;

import models.skill.Skill;
import models.utility.APIResource;
import models.utility.CharacterData;
import models.utility.NamedAPIResourceList;
import models.utility.RequestAPI;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.util.ArrayList;

import static utils.APIProperties.getProp;
import static utils.APIProperties.getServer;

public class AbilityScore extends APIResource {
    private String index;
    private String name;
    private String full_name;
    private String[] desc;
    private ArrayList<Skill> skills;

    public AbilityScore() {
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public AbilityScore get() {
        return AbilityScore.get(this.getUrl());
    }

    public static AbilityScore getIndex(String name) throws IOException {
        String path = getServer() + CharacterData.ABILITYSCORE.getEndpoint() + name;
        AbilityScore obj = (AbilityScore) RequestAPI.GET(path, AbilityScore.class);

        obj.setIsFetched(true);
        return obj;
    }

}
