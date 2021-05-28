import java.util.*;
/*The challenge here is to read N lines of input until you reach EOF,
then number and print all N lines of content.*/

//hasNext() - (boolean) Returns true if this scanner has another token in its input.
//nextLine() - (string) This method returns the rest of the current line, excluding any line separator at the end. The position is set to the beginning of the next line.
class EndOfFile {

    public static void main(String[] args) {
        int i = 0;
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            i++;
            System.out.println(i + " " + scan.nextLine());
        }

    }
}
