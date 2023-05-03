package tasks;

import data.Book;
import data.BookDAO;
import utilities.Helpers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Sort implements TaskHandler{
    public void handleTask(Scanner scanner) {
        ArrayList<Book> books = BookDAO.getBooks();
        int choice = 0;
        String[] options = {
                "Title, A to Z",
                "Title, Z to A",
                "Publication Date, old to new",
                "Publication Date, new to old",
                "Price, low to high",
                "Price, high to low",
                "Number of pages, low to high",
                "Number of pages, high to low"
        };
        outer: while(true) {
            System.out.println("** Sort Menu **");
            choice = Helpers.getChoice(scanner,options);
            switch(choice) {
                case 1:
//                    "Title, A to Z",
                    
                    break;
                case 2:
//                    "Title, Z to A",

                    break;
                case 3:
//                    "Publication Date, old to new",
                    books.sort(Comparator.comparing(Book::getPublicationDate));
                    break;
                case 4:
//                    "Publication Date, new to old",
                    books.sort((a, b) -> a.getPublicationDate().compareTo(b.getPublicationDate()) * -1);
                    break;
                case 5:
//                    "Price, low to high",
                            
                    break;
                case 6:
//                    "Price, high to low",
                            
                    break;
                case 7:
//                    "Number of pages, low to high",
                            
                    break;
                case 8:
//                    "Number of pages, high to low"
                    
                    break;
                default:
                    break outer;
            } // end switch
            Helpers.printTableHeaderRow();
            for(Book book: books) {
                Helpers.printObjectAsTableRow(book);
            }
            Helpers.pressEnterToContinue(scanner);
        } // end while loop
    }
}
