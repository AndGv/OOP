package basics.task1;

public class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return radius * Math.PI * 2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + Math.round(calculateArea()) + Math.round(calculatePerimeter()) +
                '}';
    }
}
