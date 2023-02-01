package shapes;

public class Circle extends Shape {
    // instance variables
    private double radius;

    // constructors
    public Circle() {
        super(0);
        radius = 0;
    }
    public Circle(double radius) {
        super(0);
        setRadius(radius);
    }

    // getter and setter methods
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius < 0) {
            throw new IllegalArgumentException("Invalid radius");
        }
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
