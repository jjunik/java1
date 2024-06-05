package day04;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        // if문
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        if (num > 0){
//            System.out.println(num + "는 양수입니다.");
//
//        }
//        System.out.println("프로그램 끝");

        // 1. 정수를 입력 받고 홀수이면 홀수입니다.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("정수를 입력하세요");
//        int num = sc.nextInt();
//        if (num % 2 == 1){
//            System.out.println("홀수입니다.");
//        }
//        System.out.println("프로그램 끝");


        // 2. 문자열을 입력 받고 'a'가 포함되면 단어에 'a'가 포함되네요
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        if (word.contains("a")) {
            System.out.println(word + "에 a가 포함되네요");
        }
        System.out.println("프로그램 끝");




    }
}
