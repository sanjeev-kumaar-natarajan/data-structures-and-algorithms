package searching.problems;

import searching.problems.binarySearch.*;

import java.util.Arrays;

public class SearchingDriver {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5};
        char[] letters = {'c', 'f', 'j'};
        //System.out.println(Ceiling.ceiling(nums, 3));
        //System.out.println(Floor.floor(nums, 3));
        //System.out.println(NextGreatestletter.nextGreatestLetter(letters, 'a')); //744
        //System.out.println(Arrays.toString(FirstAndLast.searchRange(nums, 8))); //34
        //System.out.println(InfiniteArray.searchInInfiniteSortedArray(nums, 17));
        //System.out.println(PeakIndex.peakIndexInMountainArray(nums)); //852
        //System.out.println(FindPeakElement.findPeakElement(nums)); //162
        //System.out.println(SearchInRotatedSortedArray.findPivotWithDuplicates(nums));
        //System.out.println(SearchInRotatedSortedArray.search(nums, 0));
        //System.out.println(SearchInRotatedSortedArray.findRotationCount(nums));
        //System.out.println(SplitArrayLargestSum.splitArray(nums, 2)); //410
        //System.out.println(SquareRoot.mySqrt(8)); //69
        //System.out.println(PerfectSquare.isPerfectSquare(808201)); // 367
        //System.out.println(ArrangeCoins.arrangeCoins(1804289383)); //441
        System.out.println(InsertPosition.searchInsert(nums, 3));
    }

}
