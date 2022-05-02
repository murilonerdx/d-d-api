package models.utility;

import org.springframework.http.HttpHeaders;

public abstract class Header {
    public static HttpHeaders DEFAULT_HEADER(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("access-control-allow-origin", "*");
        headers.add("connection", "keep-alive");
        headers.add("content-type", "application/json; charset=utf-8");

        return headers;
    }
}
