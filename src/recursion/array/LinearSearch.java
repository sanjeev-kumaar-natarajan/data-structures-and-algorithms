package recursion.array;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {

    public static int search(int[] nums, int index, int target) {
        if (index == nums.length) {
            return -1;
        }
        if (nums[index] == target) {
            return index;
        }
        return search(nums, ++index, target);
    }

    public static List<Integer> searchAllOccurrence(int[] nums, int index, int target, List<Integer> ids) {
        if (index == nums.length) {
            return ids;
        }
        if (nums[index] == target) {
            ids.add(index);
        }
        return searchAllOccurrence(nums, ++index, target, ids);
    }

    public static ArrayList<Integer> searchAllOccurrence(int[] nums, int index, int target) {
        ArrayList<Integer> ids = new ArrayList<>();
        if (index == nums.length) {
            return ids;
        }
        if (nums[index] == target) {
            ids.add(index);
        }
        ids.addAll(searchAllOccurrence(nums, ++index, target));
        return ids;
    }

}
