package data;

import java.time.LocalDate;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int numPages;
    private LocalDate publicationDate;
    private double price;
    private boolean newYorkTimesBestSeller;

    // A constructor with no parameters is called a default constructor
    public Book() {
        title = "Unknown";
        author = "Unknown";
        numPages = 0;
        publicationDate = LocalDate.now();
        price = 0;
        newYorkTimesBestSeller = false;
    }

    public Book(String title, String author,
                int numPages, LocalDate datePurchased,
                double price, boolean newYorkTimesBestSeller) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        this.publicationDate = datePurchased;
        this.price = price;
        this.newYorkTimesBestSeller = newYorkTimesBestSeller;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNewYorkTimesBestSeller() {
        return newYorkTimesBestSeller;
    }

    public void setNewYorkTimesBestSeller(boolean newYorkTimesBestSeller) {
        this.newYorkTimesBestSeller = newYorkTimesBestSeller;
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + numPages +
                ", date=" + publicationDate +
                ", price=" + price +
                ", bestSeller=" + newYorkTimesBestSeller +
                '}';
    }
}
