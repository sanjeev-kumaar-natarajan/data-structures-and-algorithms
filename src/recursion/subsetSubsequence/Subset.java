package recursion.subsetSubsequence;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static List<List<Integer>> subset(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());
        for (int num : nums) {
            int size = subsets.size();
            for (int i = 0; i < size; i++) {
                List<Integer> internal = new ArrayList<>(subsets.get(i));
                internal.add(num);
                if (!subsets.contains(internal)) {
                    subsets.add(internal);
                }
            }
        }
        return subsets;
    }
}
