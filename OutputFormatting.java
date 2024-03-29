/*In each line of output there should be two columns:
The first column contains the String and is left justified using exactly  characters.
The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100 
cpp            065 
python         050 
================================*/

import java.util.Scanner;
public class OutputFormatting {



    public static void main(String[] args) {
        System.out.println("================================");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();

            System.out.printf("%-15s%03d", s1, x);
            System.out.println(" ");

        }
        System.out.println("================================");
    }
}
