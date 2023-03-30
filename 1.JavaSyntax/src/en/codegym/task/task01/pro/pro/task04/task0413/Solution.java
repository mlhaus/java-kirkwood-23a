package en.codegym.task.task01.pro.pro.task04.task0413;

/*
Drawing a triangle
*/

//        8
//        88
//        888
//        8888
//        88888
//        888888
//        8888888
//        88888888
//        888888888
//        8888888888

public class Solution {
    public static void main(String[] args) {
        //write your code here
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}