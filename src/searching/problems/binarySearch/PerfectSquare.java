package searching.problems.binarySearch;

/**
 * LeetCode - 367
 */
public class PerfectSquare {
    public static boolean isPerfectSquare(int num) {
        long start = 0;
        long end = num / 2;
        if (num == 1) {
            return true;
        }
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long square = mid * mid;
            if (square == num) {
                return true;
            } else if (square > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
