package arrays.slidingWindowProtocol;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 0, 1, 2, 3, 0, 2, 1};
        int subArraySize = 3;
        int maxSum = findMaxSumSubArray(subArraySize, arr);
        System.out.println(maxSum);
    }

    private static int findMaxSumSubArray(int subArraySize, int[] nums) {
        if (subArraySize >= nums.length) {
            return sum(nums);
        }
        int maxSum = 0;
        int windowSum = 0;

        for (int i = 0; i < subArraySize; i++) {
            windowSum += nums[i];
        }

        maxSum = windowSum;

        for (int i = subArraySize; i < nums.length; i++) {
            windowSum = windowSum + nums[i] - nums[i - subArraySize];
            maxSum = Math.max(windowSum, maxSum);
        }

        return maxSum;
    }

    private static int sum(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }
}
