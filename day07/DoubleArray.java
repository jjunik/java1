package day07;

import java.util.Scanner;

public class DoubleArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr1 = {1, 2, 3, 4, 5};
        int[][] arr2 = new int[3][3];
        int[][] arr3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.println(arr3[i][j]);
            }
        }
        Scanner sc = new Scanner(System.in);
        String[][] menu = new String[2][3];

        for (int i = 0; i < menu.length; i++) {
            for (int j = 0; j < menu[i].length; j++) {
                if (i == 0) {
                    System.out.print(j + "번 째 빵 메뉴 입력: ");
                    menu[i][j] = sc.nextLine();
                } else {
                    System.out.print(j + "번 째 커피 메뉴 입력: ");
                    menu[i][j] = sc.nextLine();
                }
            }
        }
        for (int i = 0; i < menu.length; i++) {
            for (int j = 0; j < menu[i].length; j++) {
                if (i == 0) {
                    System.out.print(j + "번 째 빵 : ");
                } else {
                    System.out.print(j + "번 째 커피 : ");

                }

            }
        }

        int[][] scores = new int[4][3];
        String[] course = {"c", "Java", "python"};
        double java = 0;
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {

            }
        }
    }

}
