package day04;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        //유저에게 비밀번호 설정을 묻고
        //비밀번호가
        //1. ! or # or $가 포함되고
        //2. IT or it 로 시작하고
        //3. 길이가 8~20글자 이어야
        //비밀번호 설정완료 아니면 비밀번호 설정실패

        Scanner sc = new Scanner(System.in);
        System.out.println("비밀번호를 설정하세요.");
        String passWord = sc.next();
        Boolean pass = passWord.contains("!") || passWord.contains("#") || passWord.contains("$");
        Boolean pass2 = passWord.startsWith("IT") || passWord.startsWith("it");
        Boolean pass3 = passWord.length() >= 8 && passWord.length() <= 20;
        String result = pass && pass2 && pass3 ? "설정완료" : "설정실패";
        System.out.println("비밀번호 " + result);



    }
}
