import utilities.Helpers;
import utilities.UserInput;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        outer: while(true) {
//            String title = UserInput.getString(scanner, "Enter the book's title");
//            boolean hardcover = UserInput.getBoolean(scanner, "Is this a hardcover book?");
//            int modelYear = UserInput.getInt(scanner, "Enter the car's model year", 1890, 2024);
//            int currentTemp = UserInput.getInt(scanner, "Enter the current temperature");
//            int numPages = UserInput.getInt(scanner, "Enter the number of pages", 1);
            LocalDate birthday = UserInput.getDate(scanner, "Enter your birthday");
            System.out.println(Helpers.printDate(birthday));

            System.out.print("Select an option 1-6: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 1:
                    System.out.println("List all books");
                    break;
                case 2:
                    System.out.println("Sort the books");
                    break;
                case 3:
                    System.out.println("Find a book");
                    break;
                case 4:
                    System.out.println("Add a book");
                    break;
                case 5:
                    System.out.println("Update a book");
                    break;
                case 6:
                    System.out.println("Remove a book");
                    break;
                default:
                    break outer;
            }
        }
        System.out.println("Good bye!");
        scanner.close();
    }
}