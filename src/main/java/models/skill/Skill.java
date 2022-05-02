package models.skill;

public class Skill {
    private String index;
    private String name;
    private String url;

    public Skill(String index, String name, String url) {
        this.index = index;
        this.name = name;
        this.url = url;
    }

    public Skill() {
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
