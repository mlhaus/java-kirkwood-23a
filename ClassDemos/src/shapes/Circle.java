package shapes;

public class Circle extends Shape {
    // instance variables
    private double radius;

    // constructors
    public Circle() {
        super(1);
        radius = 1;
    }
    public Circle(double radius) {
        super(1);
        setRadius(radius);
    }

    // getter and setter methods
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than 0");
        }
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
