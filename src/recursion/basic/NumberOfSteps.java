package recursion.basic;

public class NumberOfSteps {
    public static int numberOfSteps(int num) {
        return stepsToZero(num, 0);
    }

    public static int stepsToZero(int num, int count) {
        if (num == 0) {
            return count;
        }
        if (num % 2 == 0) {
            return stepsToZero(num / 2, ++count);
        } else {
            return stepsToZero(num - 1, ++count);
        }
    }
}
