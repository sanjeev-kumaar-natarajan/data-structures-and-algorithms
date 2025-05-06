package searching.problems.binarySearch;

/**
 * LeetCode - 410
 */
public class SplitArrayLargestSum {
    public static int splitArray(int[] nums, int k) {
        int start = findMax(nums);
        int end = findSum(nums);
        while (start < end) {
            int mid = start + (end - start) / 2;
            int n = 1;
            int sum = 0;
            for (int i : nums) {
                if (sum + i < mid) {
                    sum += i;
                    continue;
                }
                n++;
                sum = i;
            }
            if (n <= k) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int findMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int findSum(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }
}
