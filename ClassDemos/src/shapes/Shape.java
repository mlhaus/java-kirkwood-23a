package shapes;

public abstract class Shape {
    //instance variables
    private int numSides;

    // constructor
    public Shape(int numSides) {
        // calling the setter methods
        setNumSides(numSides);
    }
    
    // getter and setter methods
    public int getNumSides() {
        return numSides;
    }
    
    public void setNumSides(int numSides) {
        if(numSides < 0) {
            throw new IllegalArgumentException("Invalid number of sides");
        }
        // assign the parameter to the instance variable
        this.numSides = numSides;
    }
    
    abstract double getArea();
}
