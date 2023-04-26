package en.codegym.task.pro.task09.task0905;

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Decimal number " + decimalNumber + " is equal to octal number " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Octal number " + octalNumber + " is equal to decimal number " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        if (decimalNumber <= 0) {
            return 0;
        }
        String octalNumber = "";
        while (decimalNumber != 0) {
            octalNumber = decimalNumber % 8 + octalNumber;
            decimalNumber = decimalNumber / 8;
        }
        return Integer.valueOf(octalNumber);
    }

    public static int toDecimal(int octalNumber) {
        if (octalNumber <= 0) {
            return 0;
        }
        String octalNumStr = octalNumber + "";
        int result = 0;
        int place = 1;
        for(int i = octalNumStr.length() - 1; i >= 0; i--) {
            char c = octalNumStr.charAt(i);
            int val = Character.getNumericValue(c); //https://stackoverflow.com/a/19388099
            result += val * place;
            place *= 8;
        }
        return result;
    }
}
