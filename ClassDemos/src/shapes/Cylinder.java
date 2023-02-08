package shapes;

public class Cylinder extends Shape {
    private double height;
    private Circle circle;

    public Cylinder() {
        super(3);
        height = 1;
        circle = new Circle();
    }
    public Cylinder(double height, Circle circle) {
        super(3);
        setHeight(height);
        setCircle(circle);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height <= 0) {
            throw new IllegalArgumentException("The height must be greater than 0.");
        }
        this.height = height;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * circle.getRadius() * this.height + 2 * circle.getArea();
    }
    
    public double getVolume() {
        return circle.getArea() * this.height;
    }
}
