package searching.problems.binarySearch;

public class Floor {
    public static int floor(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return nums[end];
    }
}
