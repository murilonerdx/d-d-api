package models.alignment;

import models.ability.AbilityScore;
import models.utility.APIResource;
import models.utility.CharacterData;
import models.utility.RequestAPI;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

import static utils.APIProperties.getServer;

public class Alignment extends APIResource {
    private String index;
    private String name;
    private String abbreviation;
    private String desc;
    private String url;

    public Alignment() {
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUrl() {
        return url;
    }

    public static Alignment get(String url){
        Alignment obj = new  com.google.gson.Gson().fromJson(new RestTemplate().getForEntity(url +"/api/ability-scores/", String.class).getBody(), Alignment.class);
        obj.setIsFetched(true);
        return obj;
    }

    public Alignment get() {
        return Alignment.get(this.getUrl());
    }

    public static Alignment getIndex(AlignmentIndex index) throws IOException {
        String path = getServer() + CharacterData.ALIGNMENT.getEndpoint() + index.getDescription();
        Alignment obj = (Alignment) RequestAPI.GET(path, Alignment.class);

        obj.setIsFetched(true);
        return obj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alignment alignment = (Alignment) o;
        return Objects.equals(index, alignment.index) && Objects.equals(name, alignment.name) && Objects.equals(abbreviation, alignment.abbreviation) && Objects.equals(desc, alignment.desc) && Objects.equals(url, alignment.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, name, abbreviation, desc, url);
    }

    @Override
    public String toString() {
        return "Alignment{" +
                "index='" + index + '\'' +
                ", name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", desc='" + desc + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
