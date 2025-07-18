package arrays.slidingWindowProtocol;

public class SmallesSubArraySumGreaterThanK {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 0, 1, 2, 3, 0, 2, 1};
        int givenSum = 9;
        int lengthOfSmallestSubarray = findMinSubArray(arr, givenSum);
        System.out.println(lengthOfSmallestSubarray);
    }

    private static int findMinSubArray(int[] nums, int givenSum) {
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;
        boolean isGreater = false;
        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];
            while (sum >= givenSum) {
                isGreater = true;
                minLength = Math.min(end - start + 1, minLength);
                sum -= nums[start];
                start++;
            }
        }
        if (isGreater)
            return minLength;
        else
            return 0;
    }
}
