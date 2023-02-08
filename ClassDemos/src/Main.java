import shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        // instantiating 4 Shape objects
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3);
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(3, 4);
        
        // Call methods on objects
        System.out.println(circle1.getNumSides()); // 1
        System.out.println(circle2.getNumSides()); // 1
        System.out.println(circle1.getRadius()); // 1
        System.out.println(circle2.getRadius()); // 3
        System.out.println(circle1.getArea()); // 3.14
        System.out.println(circle2.getArea()); // approx 28ish
        System.out.println(rect1.getNumSides()); // 4
        System.out.println(rect2.getNumSides()); // 4
        System.out.println(rect1.getArea()); // 1
        System.out.println(rect2.getArea()); // 12
        
        Cylinder cylinder1 = new Cylinder(); // height of 1, radius of 1
        Cylinder cylinder2 = new Cylinder(4, circle2); // height of 4, radius of 3
        System.out.printf("%.1f\n", cylinder1.getArea());
        System.out.printf("%.1f\n", cylinder1.getVolume());
        System.out.printf("%.1f\n", cylinder2.getArea());
        System.out.printf("%.1f\n", cylinder2.getVolume()); // 113.1
    }
}