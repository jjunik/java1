package day08;

public class Cat {
    String name;

    String breed;

    int age;

    public Cat(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    void hissing(){
        System.out.println(this.name + "이 하악질 합니다.");
    }
}
