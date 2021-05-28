import java.util.*;

/*byte: The byte data type is an 8-bit signed two's complement integer.
It has a minimum value of -128 and a maximum value of 127 (inclusive). */

/*short: The short data type is a 16-bit signed two's complement integer.
It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).*/

/*int: By default, the int data type is a 32-bit signed two's complement integer,
which has a minimum value of -2^31 and a maximum value of 2^31-1.*/

/*long: The long data type is a 64-bit two's complement integer.
The signed long has a minimum value of -2^63 and a maximum value of 2^63-1.*/

/*NOTE: .length() is only applicable to strings*/
class DataTypes {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        long iterate = num.nextLong();
      
        for (int i = 0; i < iterate; i++) {
            try {
                long numResult = num.nextLong();
                if (numResult >= -128 && numResult <= 127) {
                    System.out.println(numResult + " can be fitted in:");
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");

                } else if (numResult >= -32768 && numResult <= 32767) {
                    System.out.println(numResult + " can be fitted in:");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");

                } else if (numResult >= Math.pow(-2, 31) && numResult <= (Math.pow(2, 31) - 1)) {
                    System.out.println(numResult + " can be fitted in:");
                    System.out.println("* int");
                    System.out.println("* long");

                } else if (numResult >= Math.pow(-2, 63) && numResult <= (Math.pow(2, 63) - 1)) {
                    System.out.println(numResult + " can be fitted in:");
                    System.out.println("* long");
                }


            } catch (InputMismatchException e) {
                System.out.println(num.next() + " can't be fitted anywhere.");
            }
        }
    }
}
