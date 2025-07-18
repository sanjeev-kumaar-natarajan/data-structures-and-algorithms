package searching.problems.binarySearch;

/**
 * LeetCode - 441
 */
public class ArrangeCoins {
    public static int arrangeCoins(int n) {
        if (n == 1) {
            return 1;
        }
        long start = 1;
        long end = n / 2 + 1;
        int result = -1;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if ((mid * (mid + 1)) / 2 <= n) {
                result = (int) mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
}
