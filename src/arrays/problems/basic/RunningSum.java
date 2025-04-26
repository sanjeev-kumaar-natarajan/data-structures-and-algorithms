package arrays.problems.basic;

/**
 * LeetCode - 1480
 */
public class RunningSum {
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
