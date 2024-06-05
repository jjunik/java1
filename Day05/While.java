package Day05;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
//        //1번 a++;
//        int a = 0;
//        while (a<5){
//            a++;
//            System.out.println("수업언제끝나?");
//        }

        //1. 더하기 프로그램
        //2. 뺴기
        //3. 곱셉
        //4 제곱
        //5 나누기
        //6 나머지
        System.out.println("사칙연산 프로그램 시작!");
        Scanner sc = new Scanner(System.in);
        while (true) {
            boolean isSystemOff = false;
            System.out.println("첫 번째 정수");
            int first = sc.nextInt();
            System.out.println("두 번째 정수");
            int second = sc.nextInt();
            System.out.println("원하는 결과를 누르세요(0.프로그램 종료 1.더하기 2.빼기 3.곱하기 4.제곱 5.나누기 6.나머지");
            int num = sc.nextInt();
            int result;
            switch (num) {
                case 0:
                    isSystemOff = true;
                    break;
                case 1:
                    result = first + second;
                    System.out.println("합: " + result);
                    break;
                case 2:
                    result = first - second;
                    System.out.println("차: " + result);
                    break;
                case 3:
                    result = first * second;
                    System.out.println("곱: " + result);
                    break;
                case 4:
                    result = first;
                    for (int i = 1; i <= second ; i++) {
                        result *= first;
                        System.out.println("제곱" + result);
                    }
                    break;
                case 5:
                    result = first / second;
                    System.out.println("나누기: " + result);
                    break;
                case 6:
                    result = first % second;
                    System.out.println("나머지: " + result);
                    break;
                default:
                    System.out.println("입력 오류");
                    break;
            }
            if (isSystemOff == true) break;
        }
        System.out.println("프로그램 종료");
    }
}
