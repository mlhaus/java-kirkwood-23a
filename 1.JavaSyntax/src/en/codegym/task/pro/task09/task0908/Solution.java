package en.codegym.task.pro.task09.task0908;

public class Solution {
    public static void main(String[] args) {
//        int decimalNumber = 46;
//        System.out.println("Decimal number " + decimalNumber + " is equal to hexadecimal number " + toHex(decimalNumber));
//        String hexNum = "2e";
//        System.out.println("Hexadecimal number " + hexNum + " is equal to decimal number " + hexToDecimal(hexNum));

        String binaryNumber = "100111010000";
        System.out.println("Binary number " + binaryNumber + " is equal to hexadecimal number " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Hexadecimal number " + hexNumber + " is equal to binary number " + toBinary(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        String hexNumber = "";
        if (decimalNumber < 0) {
            return hexNumber;
        }

        while (decimalNumber != 0) {
            int tempInt = decimalNumber % 16;
            String tempStr = "";
            switch(tempInt) {
                case 15:
                    tempStr = "f";
                    break;
                case 14:
                    tempStr = "e";
                    break;
                case 13:
                    tempStr = "d";
                    break;
                case 12:
                    tempStr = "c";
                    break;
                case 11:
                    tempStr = "b";
                    break;
                case 10:
                    tempStr = "a";
                    break;
                default:
                    tempStr = Integer.toString(tempInt);
                    break;
            }
            hexNumber = tempStr + hexNumber;
            decimalNumber = decimalNumber / 16;
        }
        return hexNumber;
    }

    public static String toHex(String binaryNumber) {
        if(binaryNumber == null) return "";
        int decimalNumber = toDecimal(binaryNumber);
        String hexNumber = toHex(decimalNumber);
        return hexNumber;
    }

    public static String toBinary(String hexNumber) {
        if(hexNumber == null) return "";
        int d = hexToDecimal(hexNumber);
        String b = toBinary(d);
        return b;
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

    public static int hexToDecimal(String hexNumber) {
        int result = 0;
        int place = 1;
        for(int i = hexNumber.length() - 1; i >= 0; i--) {
            char c = hexNumber.charAt(i);
            int val = Character.getNumericValue(c); //https://stackoverflow.com/a/19388099
            if(val == -1) {
                switch(c) {
                    case 'f': val = 15; break;
                    case 'e': val = 14; break;
                    case 'd': val = 13; break;
                    case 'c': val = 12; break;
                    case 'b': val = 11; break;
                    case 'a': val = 10; break;
                }
            }
            result += val * place;
            place *= 16;
        }
        return result;
    }

}
