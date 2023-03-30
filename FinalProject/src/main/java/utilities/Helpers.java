package utilities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Helpers {
    public static String printDate(LocalDate date) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");
        String dateStr = date.format(format);
        return dateStr;
    }
}
