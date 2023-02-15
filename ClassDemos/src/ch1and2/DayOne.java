package ch1and2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DayOne {
    public static void main(String[] args) {
        // Gallons to Liters
        double gallons;
        double liters;
        gallons = 15.5;
        liters = gallons * 3.7854;
        System.out.printf("%.2f gallons is approximately %.2f liters\n", gallons, liters);


        // Example 4
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String n = scanner.nextLine();
        int yearsOld;
        System.out.print("Enter your age: ");
        yearsOld = scanner.nextInt();
        System.out.printf("Greetings %s, you are %d years old!\n", n, yearsOld);


        // Example 3
        int x = 7;
        int y = 2;
        System.out.println(x + y); // 9
        System.out.println(x - y); // 5
        System.out.println(x * y); // 14
        System.out.println(x / y); // 3
        System.out.println(x % y); // 1
        double a = 7.0;
        int b  = 2;
        System.out.println(a * b); // 14.0
        System.out.println(a / b); //3.5
        System.out.println(a % b); //1.0

        int length, width; // initializing 2 variables
        length = 3;
        width = 2;
        length = length + 1;
        // don't say "length equals length plus 1"
        // say "take the previous length + 1 and assign it to length"
        System.out.println(length);
        length += 1;
        System.out.println(length);
        length++;
        System.out.println(length);
        ++length;
        System.out.println(length);
        String firstName = "Marc"; // initializing a variable
        String lastName = "Hauschildt";
        firstName = "Amy"; // re-assign a variable
        int newAge = 21;
        String fullName = firstName + " " + lastName; // concatenation
        double acctBalance = 1000.23423;
        System.out.println(fullName);
        System.out.printf("My name is %s %s, and I am %d years old, and I have $%.2f in my checking account.\n", firstName, lastName, newAge, acctBalance);
        System.out.println(2 - 1.1); // 0.8999999999999999
        System.out.printf("%.1f\n", 2 - 1.1);

        String name = "Marc";
        int age = 1;
        System.out.println(name + age);



        // Example 2
        String myName = "Marc";
//        String mySchool = 'Kirkwood';
        char myGradeInPython = 'A';
        Character myGradeInInrish = 'F';
        int myAge = 42;
//        int myWeight = 190.5;
        Integer numKids = 0;
        System.out.println(Integer.MAX_VALUE);
        double myWeight = 190.5;
        Double gasInCar = 8.75;
        long reallyBigNumber = Long.MAX_VALUE;
        System.out.println(reallyBigNumber);
        boolean likesPizza = true;


        // Example 1
        System.out.print("Hello"); // This is a comment
        System.out.print("Hello");
    }
}
