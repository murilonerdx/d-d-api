package models.utility;

public class APIResource {
    // Check if this object has already been fetched from the API
    private boolean is_fetched;

    public boolean getIsFetched() {
        return is_fetched;
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
