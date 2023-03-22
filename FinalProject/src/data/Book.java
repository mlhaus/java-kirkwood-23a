package data;

import java.time.LocalDate;

public class Book {
    private String title;
    private int numPages;
    private LocalDate datePurchased;
    private double price;
    private boolean isHardcover;

    // A constructor with no parameters is called a default constructor
    public Book() {
        title = "Unknown";
        numPages = 0;
        datePurchased = LocalDate.now();
        price = 0;
        isHardcover = false;
    }

    public Book(String title, int numPages, LocalDate datePurchased, double price, boolean isHardcover) {
        this.title = title;
        this.numPages = numPages;
        this.datePurchased = datePurchased;
        this.price = price;
        this.isHardcover = isHardcover;
    }
}
