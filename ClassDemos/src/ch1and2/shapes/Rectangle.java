package ch1and2.shapes;

public class Rectangle extends Shape{
    private double base;
    private double height;
    
    public Rectangle() {
        super(4);
        base = 1;
        height = 1;
    }
    public Rectangle(double base, double height) {
        super(4);
        setBase(base);
        setHeight(height);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if(base <= 0) {
            throw new IllegalArgumentException("Invalid base");
        }
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height <= 0) {
            throw new IllegalArgumentException("Invalid height");
        }
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height;
    }
}
