package utilities;

import data.Book;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Helpers {
    public static int getChoice(Scanner scanner, String[] strs) {
        // Partner Assignment 5 code goes here
        return UserInput.getInt(scanner, "Choose an option 1-" + (strs.length + 1),1, strs.length + 1 ); // return the value chosen by the user
    }

    public static String printDate(LocalDate date) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String dateStr = date.format(format);
        return dateStr;
    }

    public static String printCurrency(double amt) {
        // https://stackoverflow.com/a/13791422
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(amt);
    }
    
    public static void pressEnterToContinue(Scanner scanner) {
        UserInput.getString(scanner, "Press enter to continue");
    }

    public static void printTableHeaderRow() {
        System.out.printf("%-36s\t%-18s\t%6s\t%-11s\t%8s%n",
                "Title","Publication Date","Pages","Best Seller","Price");
    }

    public static void printObjectAsTableRow(Book book) {
        System.out.printf("%-36s\t%-18s\t%6d\t%-11s\t%8s%n",
                book.getTitle(),
                printDate(book.getPublicationDate()),
                book.getNumPages(),
                book.isNewYorkTimesBestSeller() ? "Yes" : "No",
                printCurrency(book.getPrice()));
    }

    // https://stackoverflow.com/a/715660
    public static ArrayList<Book> cloneList(ArrayList<Book> list) {
        ArrayList<Book> clone = new ArrayList<Book>(list.size());
        for (Book item : list) {
            try {
                clone.add((Book)item.clone());
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
        return clone;
    }
}
