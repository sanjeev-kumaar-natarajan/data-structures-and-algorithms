package arrays.slidingWindowProtocol;

public class KdanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
    }

    private static int maxSubarraySum(int[] nums) {
        int maxSum = 0;
        int runningSum = 0;
        int subArrayCount = 0;
        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            subArrayCount++;
            if (runningSum < 0) {
                runningSum = 0;
                subArrayCount = 0;
            }
            maxSum = Math.max(runningSum, maxSum);
        }
        System.out.println(subArrayCount);
        return maxSum;
        /*int maxSum = nums[0];
        int runningSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            runningSum = Math.max(nums[i], runningSum + nums[i]);
            maxSum = Math.max(runningSum, maxSum);
        }
        return maxSum;*/
    }
}
