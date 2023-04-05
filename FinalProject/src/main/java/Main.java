import data.Book;
import data.BookDAO;
import utilities.Helpers;
import utilities.UserInput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BookDAO.retrieveData();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        String[] options = {
                "List all books",
                "Sort the books by date",
                "Find a book",
                "Add a book",
                "Update a book",
                "Remove a book"
        };
        outer: while(true) {
            choice = Helpers.getChoice(scanner,options);
            switch(choice) {
                case 1:
                    for(Book book: BookDAO.getBooks()) {
                        System.out.println("Title: " + book.getTitle());
                        System.out.println("Publication Date: " + Helpers.printDate(book.getPublicationDate()));
                        System.out.println();
                    }
                    break;
                case 2:
                    ArrayList<Book> books = BookDAO.getBooks();
                    books.sort((b1, b2) -> b1.getPublicationDate().compareTo(b2.getPublicationDate()));
                    for(Book book: books) {
                        System.out.println("Title: " + book.getTitle());
                        System.out.println("Publication Date: " + Helpers.printDate(book.getPublicationDate()));
                        System.out.println();
                    }
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                default:
                    break outer;
            } // end switch
            Helpers.pressEnterToContinue(scanner);
        } // end while loop
        System.out.println("Good bye!");
        scanner.close();
    } // end main method
}