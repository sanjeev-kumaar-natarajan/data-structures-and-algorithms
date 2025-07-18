package arrays.problems.basic;

/**
 * LeetCode - 1295
 */
public class EvenDigits {

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (hasEvenDigits(nums[i]))
                count++;
        }
        return count;
    }

    private static boolean hasEvenDigits(int num) {

        if (num == 0)
            return false;

        if (num < 1)
            num *= -1;

        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        if (count % 2 == 0)
            return true;
        else
            return false;
    }

}
