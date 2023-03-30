package en.codegym.task.task01.pro.pro.task05.task0505;

import java.util.Scanner;

/*
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums;
        if(n > 0) {
            nums = new int[n];
            for(int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
        } else {
            nums = new int[0];
        }
        if(n % 2 != 0) {
            for(int num: nums) {
                System.out.println(num);
            }
        } else {
            for(int i = nums.length - 1; i >= 0; i--) {
                System.out.println(nums[i]);
            }
        }

    }
}