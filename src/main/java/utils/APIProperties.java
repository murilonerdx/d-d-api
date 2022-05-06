package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * The type Api properties.
 */
public class APIProperties {

    /**
     * Gets prop.
     *
     * @return the prop
     * @throws IOException the io exception
     */
    public static Properties getProp() throws IOException {
        Properties props = new Properties();
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/dnd.properties");
        props.load(file);

        return props;
    }

    /**
     * Gets server.
     *
     * @return the server
     * @throws IOException the io exception
     */
    public static String getServer() throws IOException {
        return getProp().getProperty("dnd.api.server");
    }
}
