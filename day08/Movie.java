package day08;

public class Movie {
    private String name;
    private int price;

    public void setPrice(int price) {
        if (price <= 0){
            System.out.println("금액을 0이하로 지정 할 수 없습니다.");
        }else {
            this.price = price;
            System.out.println("금액 설정 완료");
        }
        this.price = price;

    }

    Movie() {
        this.name = name;

    }
}
