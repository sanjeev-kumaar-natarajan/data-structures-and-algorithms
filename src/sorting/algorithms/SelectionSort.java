package sorting.algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {-3, -5, 0, 2};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int id = 0;
            for (int j = 0; j < nums.length - i; j++) {
                id = nums[j] > nums[id] ? j : id;
            }
            swap(nums, id, nums.length - i - 1);
        }
    }

    public static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
