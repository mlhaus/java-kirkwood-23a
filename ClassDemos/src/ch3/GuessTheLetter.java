package ch3;

import java.util.Random;
import java.util.Scanner;

public class GuessTheLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String guess, answer;
        // Generate a random number between 65 and 90
        Random random = new Random();
        int min = 65;
        int max = 90;
        int randomNumber = random.nextInt(max + 1 - min) + min;
        answer = (char)randomNumber + "";  // Cast the int as a char, then convert the char to a String
//        System.out.println(answer);
        System.out.print("I'm thinking of a letter. Can you guess it? ");
        int counter = 5;
        while(counter != 0) {
            guess = scanner.nextLine();
            if(guess.equalsIgnoreCase(answer)) {
                System.out.println("You guessed correctly!");
                break;
            } else {
                counter--;
                if(counter == 0) {
                    System.out.println("The correct answer was " + answer);
                    break;
                }
//                Ternary operator (a single line if statement)
//                boolean ? valueIfTrue : valueIfFalse
                String pluralize = counter == 1 ? "" : "es";
                String output = String.format("Incorrect, you have %s guess%s remaining. ", counter, pluralize);
                System.out.println(output);
//                compareTo will return 0 if the strings are equal
//                compareTo will return a positive number if the first string is greater than the second string.
//                compareTo will return a negative number if the first string is less than the second string.
                if(guess.compareToIgnoreCase(answer) > 0) {
                    System.out.print("Guess lower: ");
                } else {
                    System.out.print("Guess higher: ");
                }
            }
        }
    }
}
