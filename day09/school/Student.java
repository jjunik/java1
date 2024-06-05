package day09.school;

public class Student {
    protected String name;
    protected int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    public String getInfo(){
        String studentInfo = "학생이름: " + this.name
                +"\n학생 학년: " + this.grade;
        return studentInfo;
    }

    public void study(){
        System.out.println("공부중");
    }
    public void test(){
        System.out.println("시험 보는중");
    }
}
