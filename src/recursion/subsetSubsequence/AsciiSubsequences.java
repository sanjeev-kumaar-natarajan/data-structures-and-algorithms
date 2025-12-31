package recursion.subsetSubsequence;

import java.util.ArrayList;
import java.util.List;

public class AsciiSubsequences {
    public static List<String> asciiSubsequences(String unProcessed, String processed) {
        if (unProcessed.isEmpty()) {
            return List.of(processed);
        }
        ArrayList<String> subsequences = new ArrayList<>();
        subsequences.addAll(asciiSubsequences(unProcessed.substring(1), processed + unProcessed.charAt(0)));
        subsequences.addAll(asciiSubsequences(unProcessed.substring(1), processed + (int) (unProcessed.toCharArray()[0] + 0)));
        subsequences.addAll(asciiSubsequences(unProcessed.substring(1), processed));
        return subsequences;
    }
}
