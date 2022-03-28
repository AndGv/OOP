package basics.task1;

public class ShapeApplication {

    public static void main(String[] args) {

            Shape circle = new Circle(5);
            Shape square = new Square(6);

            circle.calculateArea();
            circle.calculatePerimeter();

            square.calculateArea();
            square.calculatePerimeter();

            System.out.println("Circle Area: " + Math.round(circle.calculateArea()));
            System.out.println("Circle Perimeter:" + Math.round(circle.calculatePerimeter()));

            System.out.println("Square Area: " + square.calculateArea());
            System.out.println("Square Perimeter: " + square.calculatePerimeter());
    }
}
