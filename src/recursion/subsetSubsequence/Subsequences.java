package recursion.subsetSubsequence;

import java.util.ArrayList;
import java.util.List;

public class Subsequences {
    public static List<String> subsequences(String unProcessed, String processed) {
        if (unProcessed.isEmpty()) {

            return List.of(processed);
        }
        ArrayList<String> subsequences = new ArrayList<>();
        subsequences.addAll(subsequences(unProcessed.substring(1), processed + unProcessed.charAt(0)));
        subsequences.addAll(subsequences(unProcessed.substring(1), processed));
        return subsequences;
    }
}
