package day07;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String fruits[] = new String[5];
//        for (int i = 0; i < fruits.length; i++) {
//            System.out.print(i + "번 째 좋아하는 과일: ");
//            fruits[i] = sc.nextLine();
//        }
//        for (int i = 0; i < fruits.length; i++) {
//            System.out.println(i + "번 째 좋아하는 과일은 " + fruits[i].toUpperCase());
//        }
//
//
//        int num[] = new int[5];
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(i + "번 째 정수 입력: ");
//            num[i] = sc.nextInt();
//        }
//        for (int i = 4; i >= 0 ; i--) {
//            System.out.println(i + "번 째 정수는" + num[i]);
//              System.out.println(i + "번 째 정수는" + num[num.length]);
//        }


        int nums[] = new int[5];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("정수입력: ");
            nums[i] = sc.nextInt();
        }
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
                if (max < nums[i]) {
                    max = nums[i];

                }
    }
        System.out.println(max);
        }



    }

