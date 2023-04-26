package tasks;

import data.Book;
import data.BookDAO;
import utilities.Helpers;
import utilities.UserInput;

import java.util.ArrayList;
import java.util.Scanner;

public class Find implements TaskHandler {

    @Override
    public void handleTask(Scanner scanner) {
        while(true) {
            ArrayList<Book> books = Helpers.cloneList(BookDAO.getBooks());
            System.out.println("** Search **");
            String search = UserInput.getString(scanner, "Enter a book's title [Type ~ to Exit]");
            if(search.equals("~")) {
                break;
            }
            books.removeIf((book -> !book.getTitle().toLowerCase().contains(search.toLowerCase())));
            if(books.size() == 0) {
                System.out.println("Your search matched no books");
            } else {
                Helpers.printTableHeaderRow();
                for (Book book : books) {
                    Helpers.printObjectAsTableRow(book);
                }
            }
            Helpers.pressEnterToContinue(scanner);
        } // end while loop
    }
}
