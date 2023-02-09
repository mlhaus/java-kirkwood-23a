import java.util.Random;
import java.util.Scanner;

public class Feb6 {
    public static void main(String[] args) {
        String favTeam = "Eagles";
        String leastFavTeam = new String("Eagles");
        System.out.println(favTeam + " " + leastFavTeam);
        System.out.println(favTeam == leastFavTeam); // false
        System.out.println(favTeam.equals(leastFavTeam)); // true
        favTeam = "eagles";
        System.out.println(favTeam.equals(leastFavTeam)); // false
        System.out.println(favTeam.equalsIgnoreCase(leastFavTeam)); // true

        // Pages 48-49
        for(int i = 0; i <= 10; i++) {
            System.out.print(i);
            if(i % 2 == 0) {
                System.out.print(" is even");
            } else {
                System.out.print(" is odd");
            }
            System.out.println();
        }


        // Pages 52-53
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter another number: ");
        double num2 = scanner.nextDouble();
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        if(num2 != 0) {
            System.out.println(num1 / num2);
            System.out.println(num1 % num2);
        }
        if(num2 != 0 && num1 % num2 == 0) {
            System.out.println(num2 + " is a factor of " + num1);
        }

        // Page 55-75
        int n = 4;
        double m = n;
        System.out.println(m); // 4.0, you can assign an int to a double
        double k = 4.5;
        int j = (int)k; // 4, Can't assign a double to an int without casting

        // Print 10 random numbers between 1 and 6
        for(int i = 0; i < 10; i++) {
            int diceRoll = (int)(Math.random() * 6) + 1;
            System.out.print(diceRoll + " ");
        }
        System.out.println();

        // Print 30 random numbers between -10 and 10
        Random random = new Random();
        int min = -10;
        int max = 10;
        for(int i = 0; i < 30; i++) {
            int randomNumber = random.nextInt(max + 1 - min) + min;
            System.out.print(randomNumber + " ");
        }
        System.out.println();

        for(int i = 65; i <= 90; i++) {
            System.out.print((char)i);
        }
        System.out.println();

        // Page 61
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d / 3 = %.3f\n", i, (double)i / 3);
        }
        System.out.println(17.2%4);
    }
}
