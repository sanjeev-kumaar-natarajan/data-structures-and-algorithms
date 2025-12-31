package recursion.subsetSubsequence;

import java.util.ArrayList;
import java.util.List;

public class Paranthesis {
    public static List<String> generateParenthesis(int n) {
        return paranthesis("(", 1, 0, n, new ArrayList<>());
    }

    public static List<String> paranthesis(String processed, int open, int close, int n, List<String> paranthesis) {
        if (processed.length() == n * 2) {
            paranthesis.add(processed);
            return paranthesis;
        }

        if (open < n) {
            paranthesis(processed + "(", open + 1, close, n, paranthesis);
        }
        if (close < open) {
            paranthesis(processed + ")", open, close + 1, n, paranthesis);
        }

        return paranthesis;
    }
}
