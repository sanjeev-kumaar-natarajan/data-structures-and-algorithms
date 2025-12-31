package recursion.algorithms;

public class BinarySearch {
    public static int binarySearch(int[] nums, int start, int end, int target) {
        int mid = start + (end - start) / 2;
        if (start > end)
            return -1;
        if (nums[mid] == target)
            return mid;
        if (nums[mid] < target) {
            return binarySearch(nums, mid + 1, end, target);
        } else {
            return binarySearch(nums, start, mid - 1, target);
        }
    }
}
