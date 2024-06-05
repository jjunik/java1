package day08;

public class Method {
    public static void main(String[] args) {
            Cat cheese = new Cat("치즈냥이", "치즈", 3);
            Cat milk = new Cat("밀크냥이", "얼룩" , 5);
            cheese.hissing();
            milk.hissing();

        Plus a = new Plus();
       int result = a.plus100(1000,200);
        int result1 = a.aDouble(200);
        System.out.println(result);
        System.out.println(result1);

        Calc b = new Calc();
        System.out.println(b.plus(100,200));
        System.out.println(b.minus(500, 200));
        System.out.println(b.xx(2, 5));
        System.out.println(b.sep(6,2));

        Circle c = new Circle();
        System.out.println(c.getArea(5));
        System.out.println(c.getRound(10));




    }

}
