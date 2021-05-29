/*Complete the given code so that it outputs the area of a parallelogram
with breadth B and H height . You should read the variables from the
standard input. If B <= 0 or H <= 0, the output should be
"java.lang.Exception: Breadth and height must be positive" without quotes*/

/*static variables allow instances to share data of the same class*/
/*static vars and methods can be called either through the object or by calling the class*/
/*static methods cannot access instance vars and methods*/
/*the usefulness of static vars is that they are not assigned to heap memory when program starts, but ONLY IF they are called in main. saves memory.*/
import java.io.*;
import java.util.*;

class Parallelogram {
    static int height;
    static int width;
    public static int Area(int h, int w) {
        int s = h * w;
        return s;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        height = scanner.nextInt();
        width = scanner.nextInt();
        int x = 0;
        if (height > 0 && width > 0) {
            System.out.println(Area(height, width));
        } else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");

        }
    }

}