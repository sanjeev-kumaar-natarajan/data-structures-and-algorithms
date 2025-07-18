package recursion.array;

public class IsSorted {
    public static boolean isSorted(int[] nums, int index) {
        if (index == nums.length - 1) {
            return true;
        }
        return nums[index] <= nums[index + 1] && isSorted(nums, ++index);
    }
}
