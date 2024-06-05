package day09.rentcar;

import java.util.Calendar;

public class Member extends Base {
    private String id;

    private String passWord;

    private String name;

    private String address;

    private String phoneNum;

    public void Member(String id, String passWord, String name, String address, String phoneNum) {
        System.out.println("회원 정보를 등록합니다.");
        this.id = id;
        this.passWord = passWord;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }
    public String checkMemberInfo() {
        System.out.println("회원 정보 조회 ");
        System.out.println(super.showTime());
        System.out.println("_____________");
        String memberInfo = "아이디" + this.id
                + "\n비밀번호" + this.passWord
                + "\n회원이름" + this.name
                + "\n주소" + this.address
                + "\n전화번호" + this.phoneNum;
        return memberInfo;
    }
}

