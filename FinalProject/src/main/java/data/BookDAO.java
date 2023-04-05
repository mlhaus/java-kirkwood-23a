package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BookDAO {
    private static ArrayList<Book> books;

    public static void retrieveData() {
        if(books == null) {
            try (Scanner fileScanner = new Scanner(new File("FinalProject/src/main/resources/books.txt"))) {
                books = new ArrayList<>();
                fileScanner.nextLine(); // read in the header line, but don't do anything with it
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    String[] data = line.split("\t"); // use a comma for CSV files or \t for TSV files
                    // get and set all data
                    Book book = new Book();
                    book.setTitle(data[0]);
                    DateTimeFormatter format = DateTimeFormatter.ofPattern("M/d/yyyy");
                    book.setPublicationDate(LocalDate.parse(data[2], format));
                    books.add(book);
                }
                Collections.sort(books);
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
                throw new RuntimeException();
            }
        }
    }

    public static ArrayList<Book> getBooks() {
        return books;
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
