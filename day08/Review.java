package day08;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie[] movies = new Movie[10];
        int movieCount = 0;
//        movies[movieCount] = new Movie("IT코리아", 8000);
        movieCount++;
        Beverage[] beverages = new Beverage[10];
        int beverageCount = 0;
        beverages[beverageCount++] = new Beverage("콜라", 2500);
        while (true) {
            System.out.println("CGV 판매 프로그램");
            String[] movie = {"1.영화구매", "2.음료구매", "3.영화추가", "4.음료추가", "5.종료"};
            for (int i = 0; i < movie.length; i++) {
                System.out.print(movie[i]);
            }
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("영화구매");
                    for (int i = 0; i < movieCount; i++) {
//                        System.out.println(i + "." + movies[i].name + " " + movies[i].price + "원");
                    }
                    System.out.print("번호선택");
                    int movieNumber = sc.nextInt();
                    System.out.println("인원 수 입력: ");
                    int person = sc.nextInt();
//                    System.out.println(movies[movieNumber].name + "티켓 " + person + "개 판매완료");
//                    System.out.println("총 금액: " + movies[movieNumber].price * person + "원");
                case 2:
                    System.out.println("음료구매");
                    for (int i = 0; i < beverageCount; i++) {
                        System.out.println(i + "." + beverages[i].name + " " + beverages[i].price + "원");
                    }
                    System.out.println("번호 선택");
                    int beverageNum = sc.nextInt();
                    System.out.println("인원 수 입력: ");
                    int beveragePerson = sc.nextInt();
                    System.out.println("음료 " + beveragePerson + "개 판매완료");
                case 3:
                    System.out.println("영화 이름 입력: ");
                    String movieName = sc.nextLine();
                    System.out.println("영화 가격 입력: ");
                    int moviePrice = sc.nextInt();
//                    movies[movieCount++] = new Movie(movieName, moviePrice);


            }
break;
        }
    }
}