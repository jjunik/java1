package day10.Zoo;

public class Zoo {
    //static 공유성 변수

        static int animals = 30;
        public  void showAnimals(){
            System.out.println(animals);
        }
        public void upAnimal(){
            animals++;
        }


}
