package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookDAO {
    private static ArrayList<Book> books;

    public static void retrieveData() {
        try(Scanner fileScanner = new Scanner(new File("FinalProject/src/main/resources/books.csv"))) {
            books = new ArrayList<>();
            fileScanner.nextLine(); // read in the header line, but don't do anything with it
            while(fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(","); // use a comma for CSV files
                String title = data[0];
                // get all data
                Book book = new Book();
                book.setTitle(title);
                // set all data
                books.add(book);
            }
        }catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<Book> getAllBooks() {
        for(Book book: books) {
            System.out.println(book.getTitle());
        }
        return null;
    }

    public static Book getBook(String title) {
        return null;
    }

    public static void addBook(Book book) {

    }

    public static void updateBook(Book book) {

    }

    public static void deleteBook(Book book) {

    }
}
