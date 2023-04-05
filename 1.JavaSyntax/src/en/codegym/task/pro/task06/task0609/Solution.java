package en.codegym.task.pro.task06.task0609;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {

    }

    public static long cube(long a) {
        return a * a * a;
    }

    //write your code here
    public static long ninthDegree(long num) {
        return cube(cube(num));
    }
}
