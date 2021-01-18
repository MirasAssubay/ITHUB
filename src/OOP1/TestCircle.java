package OOP1;

public class TestCircle { // Сохранить как "OOP1.TestCircle.java"
    public static void main(String[] args) {

        Circle c1 = new Circle();

//        System.out.println("The circle has radius of "
//                + c1.getRadius() + " and area of " + c1.getArea());
//        OOP1.Circle c2 = new OOP1.Circle(2.0);
//        System.out.println("The circle has radius of "
//                + c2.getRadius() + " and area of " + c2.getArea());
        System.out.println(c1.getRadius());
        Circle c4 = new Circle(); // construct an instance of OOP1.Circle
        c4.setRadius(5.5); // изменить радиус
        System.out.println("radius is: " + c4.getRadius()); // Распечатать радиус через геттер
        }
}
