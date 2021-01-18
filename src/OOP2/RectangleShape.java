package OOP2;

public class RectangleShape extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public RectangleShape() {
    }

    public RectangleShape(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public RectangleShape(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    @Override
    public String toString() {
        return "RectangleShape{" +
                "width=" + width +
                ", length=" + length +
                " color =" + getColor() +
                " filled=" + isFilled() +
                '}';
    }
}
