package day10.Cal;

import java.util.Calendar;

public class Cal {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println(year);
        System.out.println(month);
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);





    }
}
