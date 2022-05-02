package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class APIProperties {

    public static Properties getProp() throws IOException {
        Properties props = new Properties();
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/dnd.properties");
        props.load(file);

        return props;
    }

    public static String getServer() throws IOException {
        return getProp().getProperty("dnd.api.server");
    }
}
