package arrays.basic;

import java.util.List;

/**
 * LeetCode - 1773
 */
public class ItemsMatchingRule {
    public static int getIndex(String ruleKey) {
        return switch (ruleKey) {
            case "type" -> 0;
            case "color" -> 1;
            case "name" -> 2;
            default -> -1;
        };
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int id = getIndex(ruleKey);
        int count = 0;
        for (List<String> item : items) {
            count += item.get(id).equals(ruleValue) ? 1 : 0;
        }
        return count;
    }
}
