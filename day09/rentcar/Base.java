package day09.rentcar;

import java.util.Calendar;

public abstract class Base {
    public String showTime(){
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DATE);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        return year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second;

    }
}
