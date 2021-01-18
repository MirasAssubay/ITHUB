package OOP1;

public class Circle {
    private double radius;


    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }



    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getCircumference() {
        return Math.PI * radius * 2;
    }

    @Override
    public String toString() {
        return "OOP1.Circle{" +
                "radius=" + radius +
                '}';
    }
}
