package arrays.problems;

import arrays.problems.basic.RunningSum;

import java.util.Arrays;

public class ArrayDriver {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 10, 1};
        //System.out.println(Arrays.toString(FromPermutation.buildArrayFromPermutation(nums))); //1920
        //System.out.println(Arrays.toString(ConcatenationOfArray.getConcatenation(nums))); //1929
        System.out.println(Arrays.toString(RunningSum.runningSum(nums)));
    }
}
