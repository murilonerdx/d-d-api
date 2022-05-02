package models.utility;

import org.springframework.web.client.RestTemplate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import static utils.APIProperties.getProp;

public class NamedAPIResourceList {

    Properties prop = new Properties();

    // The total number of resources available from this API.
    private int count;

    // The URL for the next page in the list.
    private String next;

    // The URL for the previous page in the list.
    private boolean previous;

    // A list of named API resources.
    private ArrayList<NamedAPIResource> results;

    public int getCount() {
        return count;
    }

    public NamedAPIResourceList setCount(int count) {
        this.count = count;
        return this;
    }

    public String getNext() {
        return next;
    }

    public NamedAPIResourceList setNext(String next) {
        this.next = next;
        return this;
    }

    public boolean getPrevious() {
        return previous;
    }

    public NamedAPIResourceList setPrevious(boolean previous) {
        this.previous = previous;
        return this;
    }

    public ArrayList<NamedAPIResource> getResults() {
        return results;
    }

    public NamedAPIResourceList setResults(ArrayList<NamedAPIResource> results) {
        this.results = results;
        return this;
    }

    private static NamedAPIResourceList get(String url) {
        return new com.google.gson.Gson().fromJson(new RestTemplate().getForEntity(url, String.class).getBody(), NamedAPIResourceList.class);
    }

    public static NamedAPIResourceList getByEndpoint(String endpoint) throws IOException {
        String path = getProp().getProperty("dnd.api.server");
        return get(path + endpoint);
    }

    @Override
    public String toString() {
        return new com.google.gson.Gson().toJson(this);
    }
}
