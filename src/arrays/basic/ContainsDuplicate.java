package arrays.basic;

import java.util.HashSet;
import java.util.Set;

/**
 * Leetcode -217
 */
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int i : nums) {
            if (uniqueNumbers.contains(i)) {
                return true;
            }
            uniqueNumbers.add(i);
        }
        return false;
    }

}
