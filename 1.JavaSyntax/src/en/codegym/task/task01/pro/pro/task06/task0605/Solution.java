package en.codegym.task.task01.pro.pro.task06.task0605;
/*
Correct order
*/

import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;

public class Solution {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(Integer[] arr) {
        //write your code here
//        for(int i = 0; i < arr.length / 2; i++){
//            int temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }
        ArrayUtils.reverse(arr);
    }

    public static void printArray(Integer[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}

