package models.utility;

public class APIResource{
    // Check if this object has already been fetched from the API
    private boolean is_fetched;
    private String index;
    private String name;
    private String url;

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

    public boolean getIsFetched() {
        return is_fetched;
    }

    public boolean isIs_fetched() {
        return is_fetched;
    }

    public void setIs_fetched(boolean is_fetched) {
        this.is_fetched = is_fetched;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public APIResource setIsFetched(boolean is_fetched) {
        this.is_fetched = is_fetched;
        return this;
    }

    @Override
    public String toString() {
        return new com.google.gson.Gson().toJson(this);
    }
}
