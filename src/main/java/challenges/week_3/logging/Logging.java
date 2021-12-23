package challenges.week_3.logging;

import java.io.IOException;
import java.util.logging.*;

public class Logging {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("myLog");

        try {
            Handler fileHandler = new FileHandler("src/main/java/logging/myLog.log", true);
            logger.addHandler(fileHandler);
            System.setProperty("java.util.logging.SimpleFormatter.format", "%4$s: %5$s [%1$tcl%n]");
            fileHandler.setFormatter(new CustomFormatter());
        }    catch (IOException e){
                e.printStackTrace();
        }
        //only Warning or higher level will be shown
        logger.setLevel(Level.INFO);
        logger.setFilter(new CustomFilter());
        logger.log(Level.INFO, "my message");

    }
}
