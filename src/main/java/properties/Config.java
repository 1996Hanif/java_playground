package properties;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {
    //prepping properties object
    private static final Properties config;

    //loads first
    static {
        //initialise properties
        config = new Properties();
        try {
            //load the properties files using a Reader object
        config.load(new BufferedReader(new FileReader("src/main/java/properties/config.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Expose your properties via static methods
    public static String appEnvironmentInUse(){
        return config.getProperty("env");
    }
    public static String fileLocation(){
        return config.getProperty("file_location");
    }
}
