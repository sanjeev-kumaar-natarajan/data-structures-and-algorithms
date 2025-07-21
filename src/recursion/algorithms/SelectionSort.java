package recursion.algorithms;

public class SelectionSort {
    public static void selectionSort(int[] nums) {
        selectionSortHelper(nums, 0, 0, 0);
    }

    private static void selectionSortHelper(int[] nums, int i, int j, int id) {
        if (i == nums.length - 1) {
            return;
        }
        if (j == nums.length - i) {
            swap(nums, id, nums.length - i - 1);
            selectionSortHelper(nums, ++i, 0, 0);
        } else {
            if (nums[j] > nums[id]) {
                int newId = j;
                selectionSortHelper(nums, i, ++j, newId);
            } else {
                selectionSortHelper(nums, i, ++j, id);
            }
        }
    }

    public static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
