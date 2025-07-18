package searching.problems.binarySearch;

public class InfiniteArray {
    public static int searchInInfiniteSortedArray(int[] nums, int target) {
        int start = 0;
        int end = 1;
        while (nums[end] < target) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                return nums[mid];
            }
        }
        return -1;
    }
}
