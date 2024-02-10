// Rectangle class that extends Shape
public class Rectangle extends Shape{
    // Rectangle attributes
    private double width;
    private double length;

    // Constructor
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Inherited methods from Shape.
    @Override
    public double area() {
        return width * length; // Calculates and returns area.
    }

    @Override
    public double perimeter() {
        return 2 * (length + width); // Calculates and returns perimeter.
    }

    // toString method
    @Override
    public String toString() {
        return "A rectangle with width " + width + " and length " + length + " has an area of " + area() +
                " and perimeter of " + perimeter();
    }
}
