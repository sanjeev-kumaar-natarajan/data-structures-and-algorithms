package arrays.slidingWindowProtocol;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKDistinctCharacters {
    public static void main(String[] args) {
        String str = "araaci";
        int distinct = 2;
        int longestSubstringLength = findLongestSubstringWithKDistinctCharacters(str, distinct);
        System.out.println(longestSubstringLength);
    }

    private static int findLongestSubstringWithKDistinctCharacters(String str, int distinct) {
        int maxLength = Integer.MIN_VALUE;
        int start = 0;
        HashMap<Character, Integer> charIndex = new HashMap<>();
        for (int end = 0; end < str.length(); end++) {
            if (charIndex.size() == distinct) {
                Map.Entry<Character, Integer> charToBeRemoved = charIndex.entrySet().stream().min(Map.Entry.comparingByValue()).get();
                start = Math.max(start, charToBeRemoved.getValue());
                charIndex.remove(charToBeRemoved.getKey());
            }
            charIndex.put(str.charAt(end), end);
            maxLength = Math.max(maxLength, end - start + 1);
            /*if (charIndex.containsKey(str.charAt(end))) {
                start = Math.max(charIndex.get(str.charAt(end)), start);
                charIndex.put(str.charAt(end), end);
            }
            charIndex.put(str.charAt(end), end);
            maxLength = Math.max(maxLength, end - start + 1);*/
        }
        return maxLength;
    }
}
