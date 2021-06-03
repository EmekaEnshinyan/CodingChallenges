
import java.io.*;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calendar {
	/*    public class Solution {
	 public static void main(String[] args) throws IOException {
	 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	 String[] firstMultipleInput = bufferedReader.
	 readLine().replaceAll("\\s+$", "").split(" ");

	 int month = Integer.parseInt(firstMultipleInput[0]);

	 int day = Integer.parseInt(firstMultipleInput[1]);

	 int year = Integer.parseInt(firstMultipleInput[2]);

	 String res = Result.findDay(month, day, year);*/

	public static void main(String[] args){

//Methods to access the character-based console device, if any, associated with the current Java virtual machine.
		//create console object
		//can be read without displaying the characters (useful for creating password logic)
		Console console = System.console();
		//Read line
		String str = console.readLine("test", 1);
		System.out.println("test" + str);





	}
}
