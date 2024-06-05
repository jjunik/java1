package day09.Shape;

public class Triangle extends Shape {
    private double height;
    private double under;

    public Triangle(double height, double under) {
        this.height = height;
        this.under = under;
    }

    @Override
    public double calculateArea() {
        return (height * under) / 2;
    }
}
