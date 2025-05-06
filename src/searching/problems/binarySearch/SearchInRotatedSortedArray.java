package searching.problems.binarySearch;

/**
 * LeetCode - 33
 */
public class SearchInRotatedSortedArray {

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[start] <= nums[mid]) {
                if (target < nums[mid] && target >= nums[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[start] < nums[mid]) {
                end = end - 1;
            } else if (nums[mid] < nums[end]) {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int findPivotWithDuplicates(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (start < mid && nums[mid - 1] > nums[mid]) {
                return mid - 1;
            } else if (end > mid && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid] == nums[start] && nums[end] == nums[mid]) {
                if (start < mid && nums[start] > nums[start + 1]) {
                    return start;
                } else if (end > mid && nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                start++;
                end--;
            } else if (nums[start] < nums[mid] || nums[start] == nums[mid] && nums[end] < nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int findRotationCount(int[] nums) {
        int pivotIndex = findPivotWithDuplicates(nums);
        return pivotIndex + 1;
    }
    
}
