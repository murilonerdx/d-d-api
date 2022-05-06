package models.utility;

import org.springframework.http.HttpHeaders;

/**
 * The type Header.
 */
public abstract class Header {
    /**
     * Default header http headers.
     *
     * @return the http headers
     */
    public static HttpHeaders DEFAULT_HEADER() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("access-control-allow-origin", "*");
        headers.add("connection", "keep-alive");
        headers.add("content-type", "application/json; charset=utf-8");

        return headers;
    }
}
