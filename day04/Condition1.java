package day04;

import java.util.Scanner;

public class Condition1 {
    public static void main(String[] args) {
        //if ~ else
//        int num = 3;
//        if (num > 0) {
//            System.out.println("양수입니다.");

//        } else if (num == 0) {
//            System.out.println("0 입니다");
//
//        } else{
//            System.out.println("0 또는 음수입니다.");
//        }

        //영어 점수를 물어보고,
        //90점 이상이면 a, 80점 이상 b 70이상 c 그외는 과락
//        Scanner sc = new Scanner(System.in);
//        System.out.println("영어점수를 입력하세요.");
//        int eng = sc.nextInt();
//        if (eng >= 90) {
//            System.out.println("A");
//        } else if (eng >= 80) {
//            System.out.println("B");
//        }
//        else if (eng >= 70) {
//            System.out.println("C");
//        }
//        else{
//            System.out.println("과락입니다.");
//        }

        // 2.x,y의 수를 입력받고, 몇사분면인지 나타내는 프로그램 만들기
//        Scanner sc = new Scanner(System.in);
//        System.out.println("x의 수");
//        int x = sc.nextInt();
//        System.out.println("y의 수");
//        int y = sc.nextInt();
//        if (x>0 && y>0) {
//            System.out.println("1사분면");
//        }
//        else if (x == 0 && y == 0) {
//            System.out.println("원점");
//        }
//        else if (x == 0 ) {
//            System.out.println("y축 위");
//        }
//        else if (y == 0 ) {
//            System.out.println("x축 위");
//        }
//        else if (x<0 && y>0) {
//            System.out.println("2사분면");
//        }
//        else if (x<0 && y<0) {
//            System.out.println("3사분면");
//        }
//        else {
//            System.out.println("4사분면");
//        }
        // 1. 비밀번호 설정 문제
        // 길이가 10글자 이상이 아니면 => 길이를 10글자 이상 작성하세요
        // !@#$ 가 하나라도 포함되지 않으면 => 반드시 !@#$ 가 포함되어야 합니다
        // 앞의 글자가 apple로 시작하지 않으면 => apple로 시작되어야 합니다
        // 비밀번호 설정완료
//        Scanner sc = new Scanner(System.in);
//        System.out.println("비밀번호를 설정하세요.");
//        String pw = sc.next();
//        boolean pw1 = pw.contains("!");
//        boolean pw2 = pw.contains("@");
//        boolean pw3 = pw.contains("#");
//        boolean pw4 = pw.contains("$");
//        if (pw.length() < 10) {
//            System.out.println("길이를 10글자 이상 작성하세요");
//        } else if (!pw1 && !pw2 && !pw3 && !pw4) {
//            System.out.println("반드시 !@#$가 포함되어야 합니다.");
//        } else if (!pw.startsWith("apple")) {
//            System.out.println("반드시 apple로 시작되어야 합니다.");
//        }else {
//            System.out.println("비밀번호 설정완료");
//        }

        // 2. 마트에서 총 구매 금액 할인율
        // 5만원 이상이면 5% 할인 적용해서 보여ㅛ주고
        // 10만원 이상이면 10%
        // 20만원이면 20% --- 총 구매 금액 보여주기

        Scanner sc = new Scanner(System.in);
        System.out.println("구매 금액은?");
        int price = sc.nextInt();
        if (price >= 50000) {
            System.out.println("총 구매금액은 " + price * 0.95 + "원");
        } else if (price >= 100000) {
            System.out.println("총 구매금액은 " + price * 0.9 + "원");

        } else if (price >= 200000) {
            System.out.println("총 구매금액은 " +price * 0.8 + "원");

        }
        else {
            System.out.println("총 구매금액은 " + price + "원");
        }



    }
}
