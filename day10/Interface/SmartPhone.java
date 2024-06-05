package day10.Interface;
interface Camera{
    default void takePhoto(){
        System.out.println("찰칵");
    }
    interface pay{
        default void payment(){
            System.out.println("결제완료");
        }
    }
}
public class SmartPhone extends Phone {


}
