package day09.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Circle cir = new Circle(5);
        System.out.println(cir.calculateArea());

        Rectangle rec = new Rectangle(4, 5);
        System.out.println(rec.calculateArea());

        Triangle tri = new Triangle(5,6);
        System.out.println(tri.calculateArea());
    }
}
