package recursion.algorithms;

import java.util.Arrays;

public class RecursionAlgorithmDriver {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1, -3, -5, -57, -5298};
        //System.out.println(BinarySearch.binarySearch(nums, 0, nums.length - 1, 1));
        //System.out.println(RotatedBinarySearch.rotatedBinarySearch(nums, 0, nums.length - 1, 11));
        //BubbleSort.bubbleSort(nums);
        //SelectionSort.selectionSort(nums);
        //System.out.println(Arrays.toString(MergeSort.mergeSort(nums)));
        //MergeSort.mergeSortInPlace(nums, 0, nums.length - 1);
        QuickSort.quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
