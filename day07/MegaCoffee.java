package day07;

public class MegaCoffee {
    public static void main(String[] args) {
        Coffee[] a = new Coffee[3];
        a[0] = new Coffee("아메리카노", 1000, 2, true, 20);
        a[1] = new Coffee("카페라떼", 3000, 2, true, 200);
        a[2] = new Coffee("카푸치노", 3000, 2, true, 100);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].name + " " + a[i].price + "원 ");
        }

        Bevarage[] b = {new Bevarage("콜라", 1000, 100),
                new Bevarage("에이드", 2000, 300),
                new Bevarage("콜라", 1000, 100)};
    }
}
