package recursion.algorithms;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] nums, int start, int end) {
        if (start >= end)
            return;
        int pivot = nums[start + (end - start) / 2];
        int low = start;
        int high = end;
        while (low <= high) {
            while (nums[low] < pivot) {
                low++;
            }
            while (nums[high] > pivot) {
                high--;
            }
            swap(nums, low++, high--);
        }
        quickSort(nums, start, high);
        quickSort(nums, low, end);
    }

    public static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}