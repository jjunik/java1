package day06;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] englishScores = {60, 70, 60, 70, 90};
//        for (int i = 1; i < 6; i++) {
//            System.out.println(i + "번 학생 " + englishScores[i-1] + "점");
//
//        }
//        englishScores[0] = 60;
//        englishScores[1] = 70;
//        englishScores[2] = 60;
//        englishScores[3] = 70;
//        englishScores[4] = 90;
        int[] math_score = new int[10];
        int totalScore = 0;
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i + "번째 학생 점수입력");
            math_score[i-1] = sc.nextInt();
        }
        for (int j = 0; j < 10; j++) {
            totalScore += math_score[j];
        }
        double avg = (double) totalScore / math_score.length;
        System.out.println("10명의 수학점수 평균은: " + avg);

    }
}
