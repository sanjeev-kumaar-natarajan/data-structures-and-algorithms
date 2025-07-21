package recursion.algorithms;

public class BubbleSort {
    public static void bubbleSort(int[] nums) {
        bubbleSortHelper(nums, 0, 0);
    }

    public static void bubbleSortHelper(int[] nums, int i, int j) {
        if (i == nums.length - 1) {
            return;
        }
        if (j == nums.length - i - 1) {
            bubbleSortHelper(nums, ++i, 0);
        } else {
            if (nums[j] > nums[j + 1]) {
                swap(nums, j, j + 1);
            }
            bubbleSortHelper(nums, i, ++j);
        }
    }

    public static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
