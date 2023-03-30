package en.codegym.task.task01.pro.pro.task05.task0516;
import java.util.Arrays;

/*
Filling an array
*/

public class Solution {

    public static int[] array = new int[9];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        int stopValue = array.length / 2;
        if(array.length % 2 != 0) {
            stopValue++;
        }
        Arrays.fill(array, 0, stopValue, valueStart);
        Arrays.fill(array, stopValue, array.length, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}
