package models.utility;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

/**
 * The type Request api.
 */
public class RequestAPI extends Header {

    /**
     * Get object.
     *
     * @param url    url para redirecionar
     * @param object objeto de classe generica para converter qualquer objeto
     * @return retorno é um objeto que pode ter um casting para converter de acordo com a sua necessidade
     */
    public static Object GET(String url, Class<?> object) {
        HttpHeaders headers = DEFAULT_HEADER();

        HttpEntity<Object> request = new HttpEntity<>(headers);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);

        return new RestTemplate().exchange(
                builder.build(true).toUri(), HttpMethod.GET, request,
                object
        ).getBody();
    }

    /**
     * Get list.
     *
     * @param url    url para redirecionar
     * @param object objeto generico do tipo lista, e retorna uma lista generica para utilizar de acordo com a sua necessidade
     * @return retorna um objeto generico do tipo listay
     */
    public static List<?> GET(String url, List<Class<?>> object) {
        HttpHeaders headers = DEFAULT_HEADER();

        HttpEntity<Object> request = new HttpEntity<>(headers);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);

        return new RestTemplate().exchange(
                builder.build(true).toUri(), HttpMethod.GET, request,
                object.getClass()
        ).getBody();
    }

    /**
     * Get object.
     *
     * @param url    url para redirecionar
     * @param object objeto do tipo class generica sendo um array
     * @return objeto de retorno para ter um casting
     */
    public static Object GET(String url, Class<?>[] object) {
        HttpHeaders headers = DEFAULT_HEADER();

        HttpEntity<Object> request = new HttpEntity<>(headers);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);

        return new RestTemplate().exchange(
                builder.build(true).toUri(), HttpMethod.GET, request,
                object.getClass()
        ).getBody();
    }

    /**
     * Ge ts request default resource.
     *
     * @param url    url para redirecionar
     * @param object objeto generico que extende um tipo de objeto array
     * @return retorno padrão para trazer um corpo frequente na requisição
     */
    public static RequestDefaultResource GETs(String url, Class<? extends Object[]> object) {
        HttpHeaders headers = DEFAULT_HEADER();

        HttpEntity<Object> request = new HttpEntity<>(headers);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);

        return new RestTemplate().exchange(
                builder.build(true).toUri(), HttpMethod.GET, request,
                RequestDefaultResource.class
        ).getBody();
    }
}
