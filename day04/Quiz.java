package day04;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {




        // 1. 정수를 하나 주시면, 양의홀수, 양의 짝수, 음의 홀수, 음의 홀수, 0 알려주기
//        Scanner sc = new Scanner(System.in);
//        System.out.println("정수 입력");
//        int num = sc.nextInt();
//        if (num > 0 && num % 2 == 1) {
//            System.out.println("양의 홀수");
//        } else if (num > 0 && num % 2 == 0) {
//            System.out.println("양의 짝수");
//
//        } else if (num < 0 && num % 2 == 0) {
//            System.out.println("음의 짝수");
//        } else if (num < 0 && num % 2 == -1) {
//            System.out.println("음의 홀수");
//        } else {
//            System.out.println("0");
//        }

        // 2. 서로 다른 세 정수를 주고 가장 큰 정수 출력하기
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수 입력");
        int num = sc.nextInt();
        System.out.println("두 번째 정수 입력");
        int num2 = sc.nextInt();
        System.out.println("세 번째 정수 입력");
        int num3 = sc.nextInt();
        if (num > num2 && num > num3) {
            System.out.println(num);
        } else if (num2 > num && num2 > num3) {
            System.out.println(num2);
        }



        // 3. 어떠한 단어를 입력하고 대문자이면 소문자로, 소문자이면 대문자로 출력하기
//        Scanner sc = new Scanner(System.in);
//        System.out.println("단어 입력");
//        String word = sc.next();
//        String word2 = word.toUpperCase();
//        if (word == word2) {
//            System.out.println(word.toLowerCase());
//        }else {
//            System.out.println(word.toUpperCase());
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("버스 노선 선택: (1.시내버스 2.광역버스 3.마을버스");
//        int busNum = sc.nextInt();
//        int fare = 0;
//        String bus;
//        switch (busNum) {
//            case 1:
//                bus = "시내버스";
//                fare = 1000;
//                break;
//            case 2:
//                bus = "광역버스";
//                fare = 2000;
//                break;
//            case 3:
//                bus = "마을버스";
//                fare = 1200;
//                break;
//            default:
//                bus = "오류";
//                fare = 0;
//                System.out.println("다시 입력하세요");
//                break;
//        }

//        System.out.println("나이 입력");
//        int age = sc.nextInt();
//        if (age <= 7 || age <= 65) {
//        System.out.println(bus + "금액은 " + fare + "입니다.");
//        }else if (age >=8 && age <= 19){
//            double dFare = fare * 0.7;
//            System.out.println(bus + "금액은 " + dFare + "입니다.");
//        }else {
//            System.out.println(bus + "금액은" + fare + "입니다.");
//        }






    }
}
