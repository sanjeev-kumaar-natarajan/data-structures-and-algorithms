package searching.problems.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int stalls = scanner.nextInt();
            int cows = scanner.nextInt();
            int[] positions = new int[stalls];
            for (int i = 0; i < stalls; i++) {
                positions[i] = scanner.nextInt();
            }
            Arrays.sort(positions);
            int result = binarySearch(positions, cows);
            System.out.println(result);
        }
    }

    public static int binarySearch(int[] positions, int cows) {
        int start = 1;
        int end = positions[positions.length - 1] - positions[0];
        int minDistance = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (canFitCows(positions, cows, mid)) {
                minDistance = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return minDistance;
    }

    private static boolean canFitCows(int[] positions, int cows, int minDistance) {
        int count = 1;
        int lastPosition = positions[0];
        for (int i = 1; i < positions.length; i++) {
            if (positions[i] - lastPosition >= minDistance) {
                lastPosition = positions[i];
                count++;
            }
        }
        if (count >= cows)
            return true;
        return false;
    }
}
