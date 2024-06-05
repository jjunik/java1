package day06;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            boolean MovieProgram = false;
            System.out.println("1.영화구매 2.음료구매 3.종료");
            int MenuNum = sc.nextInt();
            switch (MenuNum) {
                case 1:
                    System.out.println("1.어벤져스, 2.스파이더맨, 3.배트맨");
                    int MovieNum = sc.nextInt();
                    String MovieName = "";
                    if (MovieNum == 1) {
                        MovieName = "어벤져스";
                    } else if (MovieNum == 2) {
                        MovieName = "스파이더맨";
                    } else if (MovieNum == 3) {
                        MovieName = "배트맨";
                    } else {
                        MovieName = "다시 선택";
                    }
                    System.out.println("인원 수 입력");
                    int person = sc.nextInt();
                    System.out.println(MovieName + " 영화 티켓 " + person + "장을 판매완료!");
                    break;

                case 2:
                    System.out.println("콜라, 사이다, 환타");
                    String DrinkName = sc.next();
                    System.out.println("갯수 입력");
                    int DrinkCount = sc.nextInt();
                    System.out.println(DrinkName + " " + DrinkCount + "개 판매완료");
                    break;

                case 3:
                    MovieProgram = true;
                    break;

                default:
                    System.out.println("다시 선택하세요");
                    break;
        }
                if (MovieProgram == true) {
                    System.out.println("프로그램을 종료합니다");
                    break;
                }

        }









    }
}
