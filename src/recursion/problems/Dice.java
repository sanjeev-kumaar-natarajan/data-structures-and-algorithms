package recursion.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dice {
    public static List<String> diceCombination(String processed, int target) {
        if (target == 0) {
            return List.of(processed);
        }
        ArrayList<String> combinations = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            combinations.addAll(diceCombination(processed + i, target - i));
        }
        return combinations;
    }
}
