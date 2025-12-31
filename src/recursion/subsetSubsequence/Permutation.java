package recursion.subsetSubsequence;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<String> permutation(String unProcessed, String processed) {
        if (unProcessed.isEmpty()) {
            return List.of(processed);
        }
        ArrayList<String> permutations = new ArrayList<>();
        for (int i = 0; i < processed.length() + 1; i++) {
            permutations.addAll(permutation(unProcessed.substring(1), processed.substring(0, i) + unProcessed.charAt(0) + processed.substring(i)));
        }
        return permutations;
    }

    public static int countPermutation(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        for (int i = 0; i <= p.length(); i++) {
            count += countPermutation(p.substring(0, i) + up.charAt(0) + p.substring(i), up.substring(1));
        }
        return count;
    }
}
