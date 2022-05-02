package models.utility;

public class NamedAPIResource extends APIResource {
    // The name of the referenced resource.
    private String index;
    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public NamedAPIResource setName(String name) {
        this.name = name;
        return this;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    @Override
    public String getUrl() {
        return url;
    }

}
