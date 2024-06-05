package day06;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        //유저에게 5개의 커피메뉴를 입력받고
        //ex.1번째 커피메뉴: 모두 대문자로 나타내기
        Scanner sc = new Scanner(System.in);
        String[] CoffeeMenu = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print(i+1 + "번째 커피메뉴와 가격 입력: ");
            CoffeeMenu[i] = sc.nextLine();

        }
        for (int i = 0; i <CoffeeMenu.length; i++) {
            System.out.println(i + 1 + "번째 커피이름 " + CoffeeMenu[i] + "원");

        }
        int sum = 0;
        for (int i = 0; i < CoffeeMenu.length; i++) {
           sum += Integer.parseInt(CoffeeMenu[i].split(" ")[1]);

        }
        double avg = (double) sum / CoffeeMenu.length;
        System.out.println("가격 평균: " + avg);










    }
}
