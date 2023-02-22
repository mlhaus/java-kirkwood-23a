package utilities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    public static String getString(Scanner scanner, String prompt) {
        String value = "";
        do {
            System.out.print(prompt + ": ");
            value = scanner.nextLine();
        } while(value.equals(""));
        return value;
    }
    public static boolean getBoolean(Scanner scanner, String prompt) {
        String value = "";
        do {
            System.out.print(prompt + " [Yes or No]: ");
            value = scanner.nextLine();
        } while(!value.equalsIgnoreCase("Yes") &&
                !value.equalsIgnoreCase("No") &&
                !value.equalsIgnoreCase("Y") &&
                !value.equalsIgnoreCase("N"));
        return value.equalsIgnoreCase("Yes") || value.equalsIgnoreCase("y");
    }
    public static int getInt(Scanner scanner, String prompt) {
        return getInt(scanner, prompt, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public static int getInt(Scanner scanner, String prompt, int min) {
        return getInt(scanner, prompt, min, Integer.MAX_VALUE);
    }
    public static int getInt(Scanner scanner, String prompt, int min, int max) {
        int value = 0;
        while(true) {
            try {
                System.out.print(prompt + ": ");
                value = scanner.nextInt();
                scanner.nextLine();
                if(value < min) {
                    System.out.println("Number cannot be less than " + min + "\n");
                    continue;
                }
                if(value > max) {
                    System.out.println("Number cannot be larger than " + max + "\n");
                    continue;
                }
                break;
            } catch(InputMismatchException e) {
                System.out.println("Invalid number\n");
                scanner.nextLine();
                continue;
            }
        }
        return value;
    }

}
