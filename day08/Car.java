package day08;

public class Car {
       private String  carNum;

       private String carName;

       private String carColor;

       private int carSize;

       private String carMade;

       void registerCar(String carNum, String carName, String carColor, String carMade, int carSize) {
           this.carNum = carNum;
           this.carName = carName;
           this.carColor = carColor;
           this.carSize = carSize;
           this.carMade = carMade;
       }
}

