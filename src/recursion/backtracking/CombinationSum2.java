package recursion.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode - 40
 */
public class CombinationSum2 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        return combinationSum(candidates, 0, target, new ArrayList<Integer>(), new ArrayList<List<Integer>>());
    }

    private static List<List<Integer>> combinationSum(int[] candidates, int start, int target, List<Integer> currentNumbers, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(currentNumbers));
            return result;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (target < candidates[i]) {
                break;
            }
            currentNumbers.add(candidates[i]);
            combinationSum(candidates, i + 1, target - candidates[i], currentNumbers, result);
            currentNumbers.remove(currentNumbers.size() - 1);
        }
        return result;
    }

}
