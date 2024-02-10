// Circle class that extends the shape class
public class Circle extends Shape {
    // Private attributes
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }


    // Inherited methods from shape.
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "A circle with radius " + radius + " has an area of " + area() + " and a perimeter of " + perimeter();
    }
}
