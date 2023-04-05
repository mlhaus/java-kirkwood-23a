package utilities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Helpers {
    public static int getChoice(Scanner scanner, String[] strs) {
        // Partner Assignment 5 code goes here
        return UserInput.getInt(scanner, "Choose an option 1-" + (strs.length + 1),1, strs.length + 1 ); // return the value chosen by the user
    }

    public static String printDate(LocalDate date) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");
        String dateStr = date.format(format);
        return dateStr;
    }
    
    public static void pressEnterToContinue(Scanner scanner) {
        UserInput.getString(scanner, "Press enter to continue");
    }
}
