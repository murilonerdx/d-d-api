package models.utility;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RequestDefaultResource {
    private BigDecimal count;
    private List<DefaultDataAPI> results;

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    public List<DefaultDataAPI> getResults() {
        return results;
    }

    public void setResults(ArrayList<DefaultDataAPI> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Result{" +
                "count=" + count +
                ", results=" + results +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequestDefaultResource requestDefaultResource = (RequestDefaultResource) o;
        return Objects.equals(count, requestDefaultResource.count) && Objects.equals(results, requestDefaultResource.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, results);
    }
}
