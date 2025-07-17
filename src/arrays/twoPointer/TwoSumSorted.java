package arrays.twoPointer;

import java.util.Arrays;

public class TwoSumSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int target = 9;
        int[] result = twoSum(arr, target);
        System.out.println(Arrays.toString(result)); // Output: [2, 4]
    }

    private static int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            if (nums[start] + nums[end] == target) {
                return new int[]{nums[start], nums[end]};
            } else if (nums[start] + nums[end] > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[]{-1, -1};
    }
}
