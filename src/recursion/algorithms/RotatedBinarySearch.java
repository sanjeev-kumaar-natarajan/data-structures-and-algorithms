package recursion.algorithms;

public class RotatedBinarySearch {
    public static int rotatedBinarySearch(int[] nums, int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        if (nums[mid] > nums[start]) {
            if (target >= nums[start] && target < nums[mid]) {
                return rotatedBinarySearch(nums, start, mid - 1, target);
            } else {
                return rotatedBinarySearch(nums, mid + 1, end, target);
            }
        } else if (target > nums[mid] && target <= nums[end]) {

            return rotatedBinarySearch(nums, mid + 1, end, target);
        } else {
            return rotatedBinarySearch(nums, start, mid - 1, target);
        }
    }

}
