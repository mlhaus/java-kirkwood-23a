package finalreview;

public class Example {
    public static void main(String[] args) {
        String a1 = "Cat";
        String a2 = a1;
        a2 = "Dog";
        System.out.println(a1); // Cat


        String[] animals = {"Cat", "Dog", "Rabbit"};
        String[] animals2 = animals;
        animals2[1] = "Squirrel";
        for(String animal: animals) {
            System.out.println(animal);
        }


        String grass = "white";
        // Write this if statement as a ternary operator
        if(grass.equals("green")) {
            System.out.println("Enjoy the lawn");
        } else if(grass.equals("brown")) {
            System.out.println("Water and fertilize it");
        } else {
            System.out.println("There's snow on it");
        }
        System.out.println(grass.equals("green") ? "Enjoy the lawn" : grass.equals("brown") ? "Water and fertilize it" : "There's snow on it");

        // Print AZ, AY, AX, ... ZB, ZA
        for(int i = 65; i <= 90; i++) {
            if(i == 78) {
                continue; // skip n
            } else if(i == 89) {
                break; // stop loop at y
//                return; // ends the method
            }
            int j = 90;
            while(j >= 65) {
                System.out.println((char) i + "" + (char) j);
                j--;
            }
            System.out.println();
        }

        System.out.println("Hello");


        // Print the length of all string in an array
        // Cat, Squirrel, Rabbit
        // 3, 8, 6
        for(int i = 0; i < animals.length; i++) {
            System.out.print(animals[i].charAt(0) + " " );
            System.out.print(animals[i].charAt(animals[i].length() - 1) + " " );
            System.out.println(animals[i].length());
        }

    }
}
