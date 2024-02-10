public class ShapeArray {
    public static void main(String[] args) {
        // Instantiate some shapes.
        Shape triangle = new Triangle(2.00, 3.00, 4.00);
        Shape circle = new Circle(6.00);
        Shape square = new Rectangle(5.00, 6.00);

        // Create a shape array.
        Shape[] shapeArray = {triangle, circle, square};

        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}
