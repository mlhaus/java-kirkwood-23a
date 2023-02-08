import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Jan31Part2 {
    public static void main(String[] args) {
        long reallyBigNumber = 9999999999L;
        float something = 99.99f;

        int base = 3;
        int height = 4;
        double hypot = Math.sqrt(base * base + height * height);
        System.out.println(hypot);
        int max = Math.max(Math.max(8,1),9);
        System.out.println(max);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,1,9,2,6,7));
        int max2 = Collections.max(list);
        System.out.println(max2);

        char letter = 'A';
        String myName = "Marc";
        char firstChar = myName.charAt(0);
        char secondChar = myName.charAt(1);
        char thirdChar = myName.charAt(2);
        char lastChar = myName.charAt(myName.length() - 1);

        boolean likesPizza = true; // Don't capitalize true or false
        int age = 19;
        boolean validAge = age >= 18;


        System.out.println("First line\nSecond line");
        System.out.println("The official mascot of Kirkwood Athletics is \"Sammy the Eagle\".");

        // calculate area of a circle
        double radius = -2.5;
        double areaOfCircle = Math.PI * Math.pow(radius, 2);
        // calculate area of a cylinder
        double heightOfCylinder = -6;
        double volumeOfCylinder = areaOfCircle * heightOfCylinder;
        System.out.printf("A cylinder with a radius of %.1f " +
                "and a height of %.1f has a volume of %.2f\n",
                radius, heightOfCylinder, volumeOfCylinder);


        for(int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        // System.out.println(i); // i is scoped to the for loop

        int i;
        for(i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println(i); // is is now scoped to the main method
    }
}
