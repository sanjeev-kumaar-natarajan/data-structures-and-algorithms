package arrays.slidingWindowProtocol;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "abcbbcbbkhlkkmnhhgbabfds";
        int longestSubstringLength = findLongestSubstringWithoutRepeatingCharacters(str);
        System.out.println(longestSubstringLength);
    }

    private static int findLongestSubstringWithoutRepeatingCharacters(String str) {
        int maxLength = 0;
        int start = 0;
        int end = 0;
        HashMap<Character, Integer> uniqueCharacters = new HashMap<>();
        while (end < str.length()) {
            if (uniqueCharacters.containsKey(str.charAt(end))) {
                start = Math.max(uniqueCharacters.get(str.charAt(end)) + 1, start);
                uniqueCharacters.put(str.charAt(end), end);
            } else {
                uniqueCharacters.put(str.charAt(end), end);
            }
            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        }
        return maxLength;
    }
}
