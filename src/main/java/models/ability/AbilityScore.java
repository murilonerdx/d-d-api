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
import java.util.Arrays;
import java.util.Objects;

import static utils.APIProperties.getProp;
import static utils.APIProperties.getServer;

public class AbilityScore extends APIResource{
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

    public static AbilityScore getIndex(AbilityScoreIndex index) throws IOException {
        String path = getServer() + CharacterData.ABILITYSCORE.getEndpoint() + index.getDescription();
        AbilityScore obj = (AbilityScore) RequestAPI.GET(path, AbilityScore.class);

        obj.setIsFetched(true);
        return obj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbilityScore that = (AbilityScore) o;
        return Objects.equals(index, that.index) && Objects.equals(name, that.name) && Objects.equals(full_name, that.full_name) && Arrays.equals(desc, that.desc) && Objects.equals(skills, that.skills);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(index, name, full_name, skills);
        result = 31 * result + Arrays.hashCode(desc);
        return result;
    }

    @Override
    public String toString() {
        return "AbilityScore{" +
                "index='" + index + '\'' +
                ", name='" + name + '\'' +
                ", full_name='" + full_name + '\'' +
                ", desc=" + Arrays.toString(desc) +
                ", skills=" + skills +
                '}';
    }
}
