package day09.school;

public class College extends Student{
    private String major;

    public College(String name, int grade, String major) {
        super(name, grade);
        this.major = major;
    }
    @Override
    public String getInfo(){
        String collegeInfo = super.getInfo() + "\n학생 전공: " + this.major;
//        String studentInfo = "학생이름: " + this.name
//                +"\n학생 학년: " + this.grade;
        return collegeInfo;
    }
    public void partTime(){
        System.out.println("알바 하는중");
    }
}
