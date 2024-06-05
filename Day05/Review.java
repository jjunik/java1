package Day05;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("사용자 키 입력");
//        double cm = sc.nextDouble();
//        System.out.println("사용자 몸무게 입력");
//        int kg = sc.nextInt();
//        double bmi = kg / (cm * cm);
//        if (bmi < 18.5) {
//            System.out.println("저체중입니다.");
//        } else if (18.5 <= bmi && bmi < 25) {
//            System.out.println("정상 체중입니다.");
//        } else if (25 <= bmi && bmi < 30) {
//            System.out.println("과체중입니다.");
//        } else {
//            System.out.println("비만입니다.");
//        }


        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴 선택(1.아메리카노-4000원 2.카페라떼-4500원 3.카푸치노-5000원)");
        int number = sc.nextInt();
        System.out.println("수량입력");
        int count = sc.nextInt();
        System.out.println("멤버쉽입니까?(1.예 2.아니오)");
        int member = sc.nextInt();
        boolean isMember = member == 1;
        int price;

        switch (number) {
            case 1:
                price = 4000;
                break;
            case 2:
                price = 4500;
                break;
            case 3:
                price = 5000;
                        break;
            default:
                price = 0;
                System.out.println("다시 선택하세요.");
                break;
        }
        double total = price * count * (isMember ? 0.9 : 1);
        System.out.println("총 금액" + total + "원");

    }
}
