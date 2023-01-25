public class DayOne {
    public static void main(String[] args) {
        // Example 3
        int x = 7;
        int y = 2;
        System.out.println(x + y); // 9
        System.out.println(x - y); // 5
        System.out.println(x * y); // 14
        System.out.println(x / y); // 3
        System.out.println(x % y); // 1
        double a = 7.0;
        int b  = 2;
        System.out.println(a * b); // 14.0
        System.out.println(a / b); //3.5
        System.out.println(a % b); //1.0

        String firstName = "Marc";
        String lastName = "Hauschildt";
        int newAge = 21;
        String fullName = firstName + " " + lastName; // concatenation
        double acctBalance = 1000.23423;
        System.out.println(fullName);
        System.out.printf("My name is %s %s, and I am %d years old, and I have $%.2f in my checking account.\n", firstName, lastName, newAge, acctBalance);
        System.out.println(2 - 1.1); // 0.8999999999999999
        System.out.printf("%.1f\n", 2 - 1.1);

        // Example 2
        String myName = "Marc";
//        String mySchool = 'Kirkwood';
        char myGradeInPython = 'A';
        Character myGradeInInrish = 'F';
        int myAge = 42;
//        int myWeight = 190.5;
        Integer numKids = 0;
        System.out.println(Integer.MAX_VALUE);
        double myWeight = 190.5;
        Double gasInCar = 8.75;
        long reallyBigNumber = Long.MAX_VALUE;
        System.out.println(reallyBigNumber);
        boolean likesPizza = true;


        // Example 1
        System.out.print("Hello"); // This is a comment
        System.out.print("Hello");
    }
}
