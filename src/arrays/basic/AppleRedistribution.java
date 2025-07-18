package arrays.basic;

import java.util.Arrays;

/**
 * Leetcode -3074
 */
public class AppleRedistribution {

    public static int minimumBoxes(int[] apple, int[] capacity) {
        int noOfApples = findSum(apple);
        Arrays.sort(capacity);
        int noOfBoxesRequired = 0;
        for (int i = capacity.length - 1; i >= 0; i--) {
            noOfBoxesRequired++;
            noOfApples -= i;
            if (noOfApples <= 0) {
                return noOfBoxesRequired;
            }
        }
        return -1;
    }

    public static int findSum(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }

}
