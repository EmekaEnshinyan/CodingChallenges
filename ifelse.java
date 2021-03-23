import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int i = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
       while (i > 0){
        if (i % 2 != 0) {
            System.out.println("Weird");
            }else if (i % 2 == 0 && i >= 2 && i <= 5){
                System.out.println("Not Weird");
            }else if (i % 2 == 0 && i >= 6 && i <= 20){
                System.out.println("Weird");
            }else if (i > 20 && i % 2 == 0){
                System.out.println("Not Weird");
            }
        break;
    }
        scanner.close();
    }
}
    
