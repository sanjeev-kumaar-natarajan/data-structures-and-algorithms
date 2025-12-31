package recursion.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * LeetCode - 17
 */
public class LetterCombinations {

    private static final HashMap<Character, String> keyPad = new HashMap<>();

    private static void setKeyPad() {
        LetterCombinations.keyPad.put('2', "abc");
        LetterCombinations.keyPad.put('3', "def");
        LetterCombinations.keyPad.put('4', "ghi");
        LetterCombinations.keyPad.put('5', "jkl");
        LetterCombinations.keyPad.put('6', "mno");
        LetterCombinations.keyPad.put('7', "pqrs");
        LetterCombinations.keyPad.put('8', "tuv");
        LetterCombinations.keyPad.put('9', "wxyz");
    }

    public static List<String> letterCombinations(String digits) {
        setKeyPad();
        return getCombinations("", digits);
    }

    private static List<String> getCombinations(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            if (processed.isEmpty())
                return List.of();
            else
                return List.of(processed);
        }
        ArrayList<String> combinations = new ArrayList<>();
        for (int i = 0; i < keyPad.get(unProcessed.charAt(0)).length(); i++) {
            combinations.addAll(getCombinations(
                    processed + keyPad.get(unProcessed.charAt(0)).charAt(i)
                    , unProcessed.substring(1)));
        }
        return combinations;
    }

    public static int letterCombinationCount(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            if (processed.isEmpty())
                return 0;
            else
                return 1;
        }
        int count = 0;
        for (int i = 0; i < keyPad.get(unProcessed.charAt(0)).length(); i++) {
            count += letterCombinationCount(
                    processed + keyPad.get(unProcessed.charAt(0)).charAt(i)
                    , unProcessed.substring(1));
        }
        return count;
    }
}
