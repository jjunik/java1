package day09.school;

public class TestApp {
    public static void main(String[] args) {
        Middle kim = new Middle("김민재", 2);
        College lee = new College("이강인", 4, "의학과");

        System.out.println(lee.getInfo());
    }
}
