package recursion.algorithms;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        int mid = nums.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));
        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] mergedArray = new int[left.length + right.length];
        int leftIndex = 0, rightIndex = 0, index = 0;
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                mergedArray[index++] = left[leftIndex++];
            } else {
                mergedArray[index++] = right[rightIndex++];
            }
        }
        while (leftIndex < left.length) {
            mergedArray[index++] = left[leftIndex++];
        }
        while (rightIndex < right.length) {
            mergedArray[index++] = right[rightIndex++];
        }
        return mergedArray;
    }

    public static void mergeSortInPlace(int[] nums, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSortInPlace(nums, start, mid);
        mergeSortInPlace(nums, mid + 1, end);
        mergeInPlace(nums, start, mid, end);
    }

    public static void mergeInPlace(int[] nums, int start, int mid, int end) {
        int left = start;
        int right = mid + 1;
        int index = 0;
        int[] mergedArray = new int[end - start + 1];
        while (left <= mid && right <= end) {
            if (nums[left] < nums[right]) {
                mergedArray[index++] = nums[left++];
            } else {
                mergedArray[index++] = nums[right++];
            }
        }
        while (left <= mid) {
            mergedArray[index++] = nums[left++];
        }
        while (right <= end) {
            mergedArray[index++] = nums[right++];
        }
        for (int i = 0; i < mergedArray.length; i++) {
            nums[start++] = mergedArray[i];
        }
    }
}
