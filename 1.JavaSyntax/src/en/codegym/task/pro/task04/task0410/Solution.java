package en.codegym.task.pro.task04.task0410;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Second smallest number entered
8
4 // Minimum number
7
4 // Minimum number
5 // Second smallest number
9
5 // Second smallest number
exit
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smallestNum = Integer.MAX_VALUE;
        int secondSmallestNum = Integer.MAX_VALUE;
        int num = 0;
        // Tell me where you found it
        while(scanner.hasNextInt()) {
//            System.out.print("Enter a number: ");
            try {
                num = scanner.nextInt();
            } catch(InputMismatchException e) {
               break; // end the loop
            }
            if(num < smallestNum) {
                secondSmallestNum = smallestNum;
                smallestNum = num;
                continue; // restart the loop
            } else if(num > smallestNum && num < secondSmallestNum) {
                secondSmallestNum = num;
                continue;
            }

        }
        if(secondSmallestNum != Integer.MAX_VALUE) {
            System.out.println(secondSmallestNum);
        }
    }
}