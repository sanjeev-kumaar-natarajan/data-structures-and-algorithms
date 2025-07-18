package searching.algorithm;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] nums = {2, 1, 0};
        System.out.println(orderAgnosticBinarySearch(nums, 0));
    }

    private static int orderAgnosticBinarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[0] < nums[nums.length - 1]) {
                if (nums[mid] > target) {
                    start = mid + 1;
                } else
                    end = mid - 1;
            } else {
                if (nums[mid] > target) {
                    start = mid + 1;
                } else
                    end = mid - 1;
            }
        }
        return -1;
    }
}
