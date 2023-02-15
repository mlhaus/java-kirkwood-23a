package ch1and2;

import java.util.Scanner;

public class Jan31 {
    public static void main(String[] args) {
        int age = 19;
        if (age >= 18) {
            System.out.println("You can vote");
            System.out.println("You can go to the casino");
        }
        // Print 0 to 9
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        // Print 1 to 10
        for(int count = 1; count <= 10; count++) {
            System.out.println(count);
        }
        // Print 10, 8, 6, 4, 2
        for(int i = 10; i > 0; i -= 2 ) {
            System.out.println(i);
        }

        

        double liters;
        int gallons, counter = 0;

        for(gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.754;
            System.out.printf("%d gallons is %.2f liters\n", gallons, liters);
            counter++;
            if(counter == 10) {
                System.out.println();
                counter = 0;
            }
        }


        // How to convert integers to strings
        int myAge = 30;
        String strAge = Integer.toString(myAge); // static method
        // a static method belongs to the class
        // you call the method using the class
        
        Scanner console = new Scanner(System.in);
        // double myWeight = console.nextDouble(); // non-static method
        // a non-static method requires you to instantiate an object
        // you call the method using the object
        
        // How to convert strings to integers
        String favoriteNumber = "34";
        int myFavNum = Integer.parseInt(favoriteNumber);

        // Know 3 string methods .length, .toUpperCase, .toLowerCase
        String myName = "Marc Hauschildt";
        System.out.println(myName.length());
        System.out.println(myName.toUpperCase());
        System.out.println(myName.toLowerCase());

    }
}
