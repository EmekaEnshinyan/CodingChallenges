/*You just need to write the method, getDay, which returns the day on that date.*/

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
-------------------------------------------
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
