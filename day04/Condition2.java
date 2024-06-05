package day04;

import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {
        //switch
//        int num = 2;
//
//        switch (num) {
//            case 1:
//                System.out.println("1번 선택");
//                break;
//            case 2:
//                System.out.println("2번 선택");
//                break;
//            case 3:
//                System.out.println("3번 선택");
//                break;
//            default:
//                System.out.println("해당번호 없음");
//                break;
//        }

//        String food = "";
//
//        switch (food) {
//            case "돈까스":
//                System.out.println("돈까스 선택");
//                break;
//            case "마라탕":
//                System.out.println("마라탕 선택");
//                break;
//            case "초밥":
//                System.out.println("초밥 선택");
//                break;
//            default:
//                System.out.println("해당 음식 없음");
//                break;
//        }

        // 유저에게 요일을 물어보고
        // 월요일: 노잼 요일
        // 화요일: 나름 노잼 요일
        // 수요일 : 슬슬 지칠 요일
        // 목요일: 슬슬 기분 좋을 요일
        // 금요일: ^_^

        Scanner sc = new Scanner(System.in);
        System.out.println("오늘 요일은?");
        String day = sc.next();

        switch (day) {
            case "월요일":
                System.out.println("노잼 요일");
                break;
            case "화요일":
                System.out.println("나름 노잼 요일");
                break;
            case "수요일":
                System.out.println("슬슬 지칠 요일");
                break;
            case "목요일":
                System.out.println("슬슬 기분 좋을 요일");
                break;
            case "금요일":
                System.out.println("^_^");
                break;
            default:
                System.out.println("해당 요일 없음");
                break;
        }
    }
}
