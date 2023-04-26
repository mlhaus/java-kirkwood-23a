package en.codegym.task.pro.task09.task0906;

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 9;
        System.out.println("Decimal number " + decimalNumber + " is equal to binary number " + toBinary(decimalNumber));
        String binaryNumber = "110";
        System.out.println("Binary number " + binaryNumber + " is equal to decimal number " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        String binaryNumber = "";
        if (decimalNumber < 0) {
            return binaryNumber;
        }

        while (decimalNumber != 0) {
            binaryNumber = decimalNumber % 2 + binaryNumber;
            decimalNumber = decimalNumber / 2;
        }
        return binaryNumber;
    }

    public static int toDecimal(String binaryNumber) {
        int result = 0;
        int place = 1;
        for(int i = binaryNumber.length() - 1; i >= 0; i--) {
            char c = binaryNumber.charAt(i);
            int val = Character.getNumericValue(c); //https://stackoverflow.com/a/19388099
            result += val * place;
            place *= 2;
        }
        return result;
    }
}
