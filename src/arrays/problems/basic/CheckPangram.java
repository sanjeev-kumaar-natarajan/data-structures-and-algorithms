package arrays.problems.basic;

public class CheckPangram {
    public static boolean checkIfPangram(String sentence) {
        int[] characters = new int[26];
        for (char c : sentence.toCharArray()) {
            characters[(int) c - 97] = 1;
        }
        return !binarySearch(characters, 0);
    }

    private static boolean binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else
                return true;
        }
        return false;
    }
}
