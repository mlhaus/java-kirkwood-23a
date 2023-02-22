package ch3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Stuff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true) {
            try {
                int num = scanner.nextInt();
                sum += num;
            } catch(InputMismatchException e) {
                break;
            }
        }
        System.out.println(sum);
    }
}
