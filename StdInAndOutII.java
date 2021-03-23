import java.util.Scanner;
public class StdInAndOutII {

        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int i = scan.nextInt();
                double d = scan.nextDouble();
                //Advances this scanner past the current line and returns the input that was skipped.
                //This method returns the rest of the current line, excluding any line separator at the end.
                //The position is set to the beginning of the next line.
                scan.nextLine();
                String s = scan.nextLine();

                // Write your code here.

                System.out.println("String: " + s);
                System.out.println("Double: " + d);
                System.out.println("Int: " + i);
            }
        }
