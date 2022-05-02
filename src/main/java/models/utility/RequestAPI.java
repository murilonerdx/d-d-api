package models.utility;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class RequestAPI extends Header{

    public static Object GET(String url, Class<?> object){
        HttpHeaders headers = DEFAULT_HEADER();

        HttpEntity<Object> request = new HttpEntity<>(headers);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);

        return new RestTemplate().exchange(
                builder.build(true).toUri(), HttpMethod.GET, request,
                object
        ).getBody();
    }

    public static RequestDefaultResource GETs(String url, Class<? extends Object[]> object){
        HttpHeaders headers = DEFAULT_HEADER();

        HttpEntity<Object> request = new HttpEntity<>(headers);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);

        return new RestTemplate().exchange(
                builder.build(true).toUri(), HttpMethod.GET, request,
                RequestDefaultResource.class
        ).getBody();
    }
}
