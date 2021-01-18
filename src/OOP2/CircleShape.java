package OOP2;

public class CircleShape extends Shape{
    private double radius = 1.0;

    public CircleShape() {
    }

    public CircleShape(double radius) {
        this.radius = radius;
    }

    public CircleShape(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "CircleShape{" +
                "radius=" + radius +
                "color=" + getColor() +
                "radius=" + getRadius() +
                '}';
    }
}
