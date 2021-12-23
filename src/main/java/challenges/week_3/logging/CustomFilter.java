package challenges.week_3.logging;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class CustomFilter implements Filter {
    @Override
    public boolean isLoggable(LogRecord record) {
        //anything but warning will be returned
        return record.getLevel() != Level.WARNING;
    }
}
