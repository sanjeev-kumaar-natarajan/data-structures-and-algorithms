package recursion.subsetSubsequence;

import java.util.ArrayList;
import java.util.List;

public class Subs {
    public static List<String> subsequences(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            return List.of(processed);
        }
        List<String> subsequences = new ArrayList<>();
        subsequences.addAll(subsequences(processed + unprocessed.charAt(0), unprocessed.substring(1)));
        subsequences.addAll(subsequences(processed, unprocessed.substring(1)));
        return subsequences;
    }
}
