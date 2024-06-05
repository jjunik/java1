package Day02;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇 년생인가요?");
        int year = sc.nextInt();
        int age = 2025 - year;
        System.out.println(age + "살 이시군요!");

        System.out.println("정삼각형 넓이 구하는 내용");
        System.out.println("밑변 입력");
        int a = sc.nextInt();
        System.out.println("높이 입력");
        int b = sc.nextInt();
        System.out.println("정삼각형의 넓이는: " + a * b * 0.5);

        System.out.println("정사각형 넓이 구하는 내용");
        System.out.println("밑변 입력");
        int c = sc.nextInt();
        System.out.println("높이 입력");
        int d = sc.nextInt();
        System.out.println("정사각형의 넓이: " + c * d);

        System.out.println("엔화 계산기");
        System.out.println("금액을 입력하세요");
        int won = sc.nextInt();
        Double yen = won * 0.878;
        System.out.println("엔화: " + yen);











    }
}
