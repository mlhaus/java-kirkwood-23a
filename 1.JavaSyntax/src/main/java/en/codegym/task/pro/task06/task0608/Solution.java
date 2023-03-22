package en.codegym.task.pro.task06.task0608;

/*
A cube calculator
*/

public class Solution {
    public static void main(String[] args) {
        System.out.printf("%,.0f", (double)cube(999L));
    }

    //write your code here
    public static long cube(long l) {
        return (long)Math.pow(l, 3);
    }
}
