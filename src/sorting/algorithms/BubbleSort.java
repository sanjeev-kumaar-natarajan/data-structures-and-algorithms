package sorting.algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {-1, 0, -3};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                    isSwapped = true;
                }
            }
            if (!isSwapped)
                break;
        }
    }

    public static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
