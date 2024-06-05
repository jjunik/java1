package Day02;

public class TypeCasting {
    public static void main(String[] args) {
        //타입변환(타입캐스팅)
        //좁은 범위에서 넓은 범위로 타입 변환은 암묵적 타입 캐스팅
        //넓은 범위에서 좁은 범위로 타입변환은 명시적 타입 캐스팅 필수

        // 숫자: 정수 -> 실수 (o), 실수 -> 정수 (x)
        // 동물: 고양이 -> 동물 (o), 고양이 -> 동물 (x)
        // cat -> animal (o), animal -> (animal)cat
        int a = 100;
        double b = a;

        double c = 3.14;
        int d = (int) c;

        //String > int ,double, float
        Integer.valueOf("1000");
        Integer.parseInt("1001");
        Double.parseDouble("123.1");



//        int a = 10;
//        int b = 20;
//        System.out.println(a*b);
//
//        String c = "30";
//        String d = "50";
//        System.out.println(a+c);
//        System.out.println(c+d);



    }
}
