package datetimeVariables;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeVariables {
    public static void getTimeMethods(){
        // czas aktualny
        LocalTime actual = LocalTime.now();
        // czas dowolny
        LocalTime custom = LocalTime.of(10,10,10);
        System.out.println(actual);
        System.out.println(custom);
        LocalTime parsed = LocalTime.parse("12:33:12");
        System.out.println(parsed);
        System.out.println(parsed.getHour() + ":" + parsed.getMinute());
        System.out.println(actual.plusHours(1));
        if(actual.isAfter(custom)){
            System.out.println("czas: " + actual + " jest później");
        } else {
            System.out.println("czas: " + custom + " jest później");
        }
    }
    public static void getDateMethods(){
        LocalDate actulDate = LocalDate.now();
        LocalDate customDate = LocalDate.of(2000,5,21);
        System.out.println(actulDate);
        System.out.println(customDate);

    }

    public static void main(String[] args) {
//        getTimeMethods();
    getDateMethods();
    }
}
