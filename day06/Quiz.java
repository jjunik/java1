package day06;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        //1.email 주소 3개 받고
        //유저 아이디만 출력하기
        Scanner sc = new Scanner(System.in);
        String[] emails = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println(i+1 + "번째 e-mail 주소 입력: ");
            String email = sc.nextLine();
            emails[i] = email.split("@")[0];

        }
        for (int i = 0; i < emails.length; i++) {
            System.out.println(i + 1 + "번째 아이디: " + emails[i]);

        }


        //2. 과일이름 4개 받고
        // 5글자 이하이면 대문자고 아니면 과일의 문자길이로 나타내기
    }
}
