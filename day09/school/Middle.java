package day09.school;

public class Middle extends Student{

    public Middle(String name, int grade) {
        super(name, grade);
    }
    public void eating(){
        System.out.println(this.name);
        System.out.println("급식 먹는중~");
    }

}
