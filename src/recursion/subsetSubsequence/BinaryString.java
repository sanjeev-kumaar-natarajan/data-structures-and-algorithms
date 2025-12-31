package recursion.subsetSubsequence;

import java.util.ArrayList;
import java.util.List;

public class BinaryString {
    public static List<String> binaryString(String processed, int length, int n) {
        if (processed.length() == n) {
            return List.of(processed);
        }
        List<String> binaryString = new ArrayList<>();
        binaryString.addAll(binaryString(processed + "0", length + 1, n));
        binaryString.addAll(binaryString(processed + "1", length + 1, n));
        return binaryString;
    }
}
