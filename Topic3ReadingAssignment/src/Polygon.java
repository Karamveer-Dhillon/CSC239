public class Polygon {
    // Attributes
    private int numberSides;
    private double sideLength;

    // Constructors
    public Polygon() {
        this.numberSides = 3;
        this.sideLength = 1;
    }

    public Polygon(int numberSides, double sideLength) {
        this.numberSides = numberSides;
        this.sideLength = sideLength;
    }

    // Getters and Setters
    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = (sideLength > 0) ? sideLength : 1;
    }

    public int getNumberSides() {
        return numberSides;
    }

    public void setNumberSides(int numberSides) {
        this.numberSides = (numberSides > 2) ? numberSides : 3;
    }

    // Methods to calculate perimeter and area
    public double perimeter() {
        return numberSides * sideLength;
    }

    public double area() {
        return (numberSides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / numberSides));
    }
    // toString method
    @Override
    public String toString() {
        return "Polygon [numberSides=" + numberSides + ", sideLength=" + sideLength + "]";
    }
}
