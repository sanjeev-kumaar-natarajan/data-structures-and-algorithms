package arrays.problems;

import arrays.basic.FirstMissingPositive;

public class ArrayDriver {

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        //System.out.println(Arrays.toString(FromPermutation.buildArrayFromPermutation(nums))); //1920
        //System.out.println(Arrays.toString(ConcatenationOfArray.getConcatenation(nums))); //1929
        /*SortColors.sortColors(nums);
        System.out.println(Arrays.toString(nums));*/ //75
        //System.out.println(Arrays.toString(ProductExceptSelf.productExceptSelf(nums))); //238
        System.out.println(FirstMissingPositive.firstMissingPositive(nums));
    }

}
