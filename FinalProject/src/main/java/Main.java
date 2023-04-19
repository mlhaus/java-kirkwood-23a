import data.Book;
import data.BookDAO;
import tasks.Add;
import tasks.Sort;
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
                "Sort the books",
                "Find a book",
                "Add a book",
                "Update a book",
                "Remove a book"
        };
        outer: while(true) {
            System.out.println("** Main Menu **");
            choice = Helpers.getChoice(scanner,options);
            switch(choice) {
                case 1:
                    Helpers.printTableHeaderRow();
                    for(Book book: BookDAO.getBooks()) {
                        Helpers.printObjectAsTableRow(book);
                        System.out.println(book);
                    }
                    break;
                case 2:
                    new Sort().handleTask(scanner);
                    break;
                case 3:

                    break;
                case 4:
                    new Add().handleTask(scanner);
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