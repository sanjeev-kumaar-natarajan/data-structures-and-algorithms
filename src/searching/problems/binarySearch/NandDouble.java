package searching.problems.binarySearch;

import java.util.Arrays;

public class NandDouble {
    public static boolean checkIfExist(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int start = 0;
            int end = nums.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (mid == i) {
                    if (start < mid) {
                        mid = mid - 1;
                    } else if (end > mid) {
                        mid = mid + 1;
                    }
                } else if (nums[mid] == nums[i] * 2) {
                    return true;
                } else if (nums[mid] < nums[i] * 2) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}
