package OOP2;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(1, 1, 5);
        System.out.println(c1);
        System.out.println("Center of Circle X, Y " + c1.getCenterX() + ' ' + c1.getCenterY());
        System.out.println("Radius of Circle " + c1.getRadius());
        System.out.println(c1.getArea());
    }
}
