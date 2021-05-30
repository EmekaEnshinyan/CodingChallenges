/*You just need to write the method, getDay() , which returns the day on that date.*/

import java.util.Scanner;
import java.time.*;

public class DateAndTime{

    public static void getDay(){
        Scanner sc = new Scanner(System.in);
        int mm = sc.nextInt();
        int dd = sc.nextInt();
        int yy = sc.nextInt();
        System.out.println(mm + " " + dd + " " + yy + " ");
        LocalDate dt = LocalDate.of(yy, mm, dd);
        System.out.println(dt.getDayOfWeek());

    }
    public static void main(String[] args){
        ScratchPaper.getDay();


    }
}