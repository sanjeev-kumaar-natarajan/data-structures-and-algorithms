package searching.problems.binarySearch;

/**
 * LeetCode - 167
 */
public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int result = binarySearch(target - numbers[i], i, numbers);
            if (result != -1) {
                return new int[]{i, result};
            }
        }
        return new int[]{-1, -1};
    }

    public static int binarySearch(int target, int i, int[] numbers) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == i && target - numbers[mid] > 0) {
                start = mid + 1;
            } else if (mid == i && target - numbers[mid] < 0) {
                end = mid - 1;
            } else if (numbers[mid] == target) {
                return mid;
            } else if (numbers[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
