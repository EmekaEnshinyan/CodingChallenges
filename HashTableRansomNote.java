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

class Hash {
    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */
    public static void checkMagazine(List<String> magazine, List<String> note) {
        if (note == null || magazine == null) {
            System.out.println("No");
            return;
        }
      
        HashMap<String, Integer> noteWords = new HashMap<>();

        String[] noteArray = new String[note.size()];
        noteArray = note.toArray(noteArray);

        for (int j = 0; j < note.size(); j++){
            noteWords.put(noteArray[j], j);
        }
      
        int counter = 0;
        for (int i = 0; i < magazine.size(); i++) {
            if (noteWords.containsKey(magazine.get(i))){
                counter++;
            }
        }
      
        if (note.size() == counter){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

public class HashTablesRansomNote {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        List<String> magazine = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .collect(toList());

        List<String> note = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .collect(toList());

        Hash.checkMagazine(magazine, note);

        bufferedReader.close();
    }
}
