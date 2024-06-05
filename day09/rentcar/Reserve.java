package day09.rentcar;

import java.util.Calendar;

public class Reserve extends Base {
        private String  resNumber;

        private String resCarNumber;

        private String resDate;

        private String useBeginDate;

        private String useEndDate;

    public Reserve(String resNumber, String resCarNumber, String resDate, String useBeginDate, String useEndDate) {
        System.out.println("차 정보를 등록합니다.");
        this.resNumber = resNumber;
        this.resCarNumber = resCarNumber;
        this.resDate = resDate;
        this.useBeginDate = useBeginDate;
        this.useEndDate = useEndDate;

    }
    public String checkReserveInfo(){
        System.out.println("예약 정보를 조회합니다.");
        System.out.println(super.showTime());
        System.out.println("_____________________");
        String resInfo = "예약 번호" + this.resNumber
                + "\n차 번호:" + this.resCarNumber
                + "\n예약 일자:" + this.resDate
                + "\n사용 시작일:" + this.useBeginDate
                + "\n사용 반납일:" + this.useEndDate;
        return resInfo;
}

}
