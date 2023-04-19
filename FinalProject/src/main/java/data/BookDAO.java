package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BookDAO {
    private static ArrayList<Book> books;
    private static final String FILE_PATH = "FinalProject/src/main/resources/";
    private static final String FILE_NAME = "books.txt";
    private static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");

    public static void retrieveData() {
        if(books == null) {
            try (Scanner fileScanner = new Scanner(new File(FILE_PATH + FILE_NAME))) {
                books = new ArrayList<>();
                fileScanner.nextLine(); // read in the header line, but don't do anything with it
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    String[] data = line.split("\t"); // use a comma for CSV files or \t for TSV files
                    // get and set all data
                    Book book = new Book();
                    book.setTitle(data[0]);
                    book.setAuthor(data[1]);
                    book.setPublicationDate(LocalDate.parse(data[2], dateFormat));
                    book.setNumPages(Integer.parseInt(data[3]));
                    book.setPrice(Double.parseDouble(data[5]));
                    book.setNewYorkTimesBestSeller(Boolean.parseBoolean(data[4]));
                    books.add(book);
                }
                Collections.sort(books);
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
                throw new RuntimeException();
            }
        }
    }

    private static void writeData() {
        try(PrintWriter writer = new PrintWriter(new File(FILE_PATH + FILE_NAME))) {
            writer.println("title\tauthor\tpublication_date\tnum_pages\tnytimes_best_seller\tlist_price");
            for(Book book: books) {
                writer.printf("%s\t%s\t%s\t%s\t%s\t%s\n",
                        book.getTitle().toUpperCase(),
                        book.getAuthor(),
                        book.getPublicationDate().format(dateFormat),
                        book.getNumPages(),
                        Boolean.toString(book.isNewYorkTimesBestSeller()).toUpperCase(),
                        book.getPrice()
                );
            }
        } catch(FileNotFoundException e) {
            
        }
    }

    public static ArrayList<Book> getBooks() {
        return books;
    }

    public static Book getBook(String title) {
        return null;
    }

    public static void addBook(Book book) {
        books.add(book);
        writeData();
    }

    public static void updateBook(Book book) {

    }

    public static void deleteBook(Book book) {

    }
}
