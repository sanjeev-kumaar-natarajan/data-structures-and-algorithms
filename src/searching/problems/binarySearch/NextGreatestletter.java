package searching.problems.binarySearch;

/**
 * LeetCode - 744
 */
public class NextGreatestletter {
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        if (letters[0] > target)
            return letters[0];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return letters[start];
    }
}
