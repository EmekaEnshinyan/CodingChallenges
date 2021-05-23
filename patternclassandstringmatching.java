import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CodelandUsernameValidation{

    public static String CodelandUsernameValidation(String str) {
        //searches for a pattern
        //syntax: Pattern x = new Pattern.compile("");
        Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9_]{2,23}[^_]");
        //then add Matcher to make sure the pattern matches the string to be analyzed
        //syntax: Matcher y = <the pattern object (x)>.matches(<the string to be analyzed>);
        Matcher matcher = p.matcher(str);
        //boolean check if the string matches pattern (x)
        return matcher.matches() ? "true" : "false";
    }


    public static void main(String[] args) {
        //user input and calls function
        Scanner s = new Scanner(System.in);
        System.out.print(CodelandUsernameValidation(s.nextLine()));
    }
}
