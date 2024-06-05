package day09.rentcar;

import java.util.Calendar;

public class Car extends Base {
       private String  carNum;

       private String carName;

       private String carColor;

       private int carSize;

       private String carMade;
// 차 등록
       public void registerCar(String carNum, String carName, String carColor, int carSize, String carMade) {
           System.out.println("차 정보를 등록합니다.");
           this.carNum = carNum;
           this.carName = carName;
           this.carColor = carColor;
           this.carSize = carSize;
           this.carMade = carMade;
       }
       //차량 정보 조회
    public String checkCarInfo(){
        System.out.println("렌트카 정보를 조회합니다.");
        System.out.println(super.showTime());
        System.out.println("_____________________");
        String carInfo = "차 번호" + this.carNum
                + "\n차 이름:" + this.carName
                + "\n차 색상:" + this.carColor
                + "\n차 크기:" + this.carSize
                + "\n차 제조사:" + this.carMade;
        return carInfo;
    }
}

