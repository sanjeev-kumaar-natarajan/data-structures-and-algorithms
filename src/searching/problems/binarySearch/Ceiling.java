package searching.problems.binarySearch;

public class Ceiling {
    public static int ceiling(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return nums[start];
    }
}
