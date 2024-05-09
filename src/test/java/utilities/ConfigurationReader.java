package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;
    static {
        String fileWay= "configuration.properties";
        try {
            FileInputStream fis= new FileInputStream(fileWay);
            properties= new Properties();
            properties.load(fis);
        } catch (IOException e) {
            System.out.println("properties file didn't read");
        }
    }
    public static String get(String key){

        return properties.getProperty(key);
    }
    public static void set(String keyName, String value) {
        String path = "Configuration.properties";

        try {
            OutputStream output = new FileOutputStream(path);
            properties.setProperty(keyName, value);
            properties.store(output, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
