package Day05;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
//        for문
//        for (int i = 0; i < 5; i++) {
//            System.out.println("i는" + i);
//            System.out.println("오늘 수요일");
//        }
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자입력");
        int a = sc.nextInt();
        for (int j = 0; j <= a ; j++) {
            System.out.println(j);
        }

        System.out.println("첫 번째 숫자입력");
        int first = sc.nextInt();
        System.out.println("두 번째 숫자입력");
        int second = sc.nextInt();
        for (int k = first; k <= second ; k++) {
            System.out.println(k);
        }


    }
}
