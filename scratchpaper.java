import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScratchPaperTwo {

 public static void main(String[] args){

     Pattern pat = Pattern.compile("hello");
     Matcher mat = pat.matcher("hello");
     //only captures the pattern of [String of chars followed by a number]
     Pattern pat1 = Pattern.compile("[a-z]+, [1-9]");
     Matcher mat1 = pat1.matcher("this is a test and 1 is one, 2 is two, and here's a pound: #");
     Pattern pat2 = Pattern.compile("abc");
    String[] str = pat2.split("one, two. three! four? five# six* seven7 8");
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     //find() returns a boolean
     //System.out.println(mat.find());
     while (mat1.find()){
         System.out.println(mat1.find());
     }
     for (int i = 0; i < str.length; i++){
         System.out.println(str[i]);
     }




 }
}
