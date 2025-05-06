package searching.problems.binarySearch;

/**
 * LeetCode - 69
 */
public class SquareRoot {
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        int start = 1;
        int end = x / 2;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid <= x) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
}
