package searching.problems.binarySearch;

/**
 * LeetCode - 34
 */
public class FirstAndLast {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = binarySearch(nums, target, true);
        if (result[0] != -1) {
            result[1] = binarySearch(nums, target, false);
        }
        return result;
    }

    public static int binarySearch(int[] nums, int target, boolean isFirstOccurence) {
        int start = 0;
        int end = nums.length - 1;
        int resultIndex = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target)
                start = mid + 1;
            else if (nums[mid] > target)
                end = mid - 1;
            else {
                resultIndex = mid;
                if (isFirstOccurence) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return resultIndex;
    }
}
