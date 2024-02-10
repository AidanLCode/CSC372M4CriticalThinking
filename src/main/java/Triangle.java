// Triangle class that extends the shape class
public class Triangle extends Shape {
    // Private triangle attributes
    private double lengthSide1;
    private double lengthSide2;
    private double lengthSide3;

    // Constructor
    public Triangle(double lengthSide1, double lengthSide2, double lengthSide3) {
        this.lengthSide1 = lengthSide1;
        this.lengthSide2 = lengthSide2;
        this.lengthSide3 = lengthSide3;
    }

    // The area using Heron's Formula
    @Override
    public double area() {
        double s = perimeter() / 2; // This is the semi-perimeter used in the calculation.
        double area = Math.sqrt(s * (s - lengthSide1) * (s - lengthSide2) * (s - lengthSide3));
        return area;
    }

    // The perimeter of a triangle is the sum of the length of all sides.
    @Override
    public double perimeter() {
        return lengthSide1 + lengthSide2 + lengthSide3;
    }

    @Override
    public String toString() {
        return "A triangle with side lengths " + lengthSide1 + ", " + lengthSide2 + ", and " + lengthSide3 +
                " has a perimeter of " + perimeter() + " and an area of " + area();
    }
}
