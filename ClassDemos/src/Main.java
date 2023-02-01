import shapes.*;

public class Main {
    public static void main(String[] args) {
        // instantiating 4 Shape objects
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3);
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(3, 4);
        
        // Call methods on objects
        System.out.println(circle1.getNumSides()); // 0
        System.out.println(circle2.getNumSides()); // 0
        System.out.println(circle1.getRadius()); // 0
        System.out.println(circle2.getRadius()); // 3
        System.out.println(circle1.getArea()); // 0
        System.out.println(circle2.getArea()); // approx 28ish
        System.out.println(rect1.getNumSides()); // 4
        System.out.println(rect2.getNumSides()); // 4
        System.out.println(rect1.getArea()); // 0
        System.out.println(rect2.getArea()); // 12
    }
}