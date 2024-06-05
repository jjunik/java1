package day03;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇 살이신가요?");
        int age = sc.nextInt();
        int year = 2025 - age;
        System.out.println(year + "년생 이시군요!");


        System.out.println("반지름을 입력하세요.");
        int r = sc.nextInt();
        double circle = r*r*3.14;
        System.out.println("원의 넓이는 " + circle);


    }
}
