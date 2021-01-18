package OOP2;

public class SquareShape extends RectangleShape {
    public SquareShape() {
    }

    public SquareShape(double side) {
        super(side, side);
    }

    public SquareShape(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide(){
        return super.getWidth();
    }

    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        this.setSide(width);

    }

    public void setLength(double length) {
        this.setSide(length);
    }

    public String toString() {
        return "SquareShape{" +
                "width=" + getWidth() +
                ", color='" + getColor() +
                ", filled=" + isFilled() +
                '}';
    }

    public double getArea() {
        return super.getWidth() * super.getWidth();
    }

    public double getPerimeter() {
        return super.getWidth() * 4;
    }
}
