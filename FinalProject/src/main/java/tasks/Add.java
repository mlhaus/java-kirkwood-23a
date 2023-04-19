package tasks;

import data.Book;
import data.BookDAO;
import utilities.UserInput;

import java.time.LocalDate;
import java.util.Scanner;

public class Add implements TaskHandler {
    @Override
    public void handleTask(Scanner scanner) {
        Book book = new Book();
        String title = UserInput.getString(scanner, "Enter the book's title");
        book.setTitle(title);
        LocalDate publicationDate = UserInput.getDate(scanner, "Enter the book's publication date");
        book.setPublicationDate(publicationDate);
        int numPages = UserInput.getInt(scanner, "Enter the number of pages", 0);
        book.setNumPages(numPages);
        boolean isNewYorkTimesBestSeller = UserInput.getBoolean(scanner, "Is this book a New York Times best seller?");
        book.setNewYorkTimesBestSeller(isNewYorkTimesBestSeller);
        // Final Project - Part 3, Write a method to get a double in the UserInput class.
        // Call that method to get the double from the user
        BookDAO.addBook(book);
    }
}
