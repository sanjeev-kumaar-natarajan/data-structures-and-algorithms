package searching.problems.binarySearch;

public class FindMinimum {
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int pivotIndex = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (start < mid && nums[mid] < nums[mid - 1]) {
                pivotIndex = mid - 1;
                break;
            } else if (end > mid && nums[mid] > nums[mid + 1]) {
                pivotIndex = mid;
                break;
            } else if (nums[start] <= nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (pivotIndex != -1) {
            return nums[pivotIndex + 1];
        }
        return nums[0];
    }
}
