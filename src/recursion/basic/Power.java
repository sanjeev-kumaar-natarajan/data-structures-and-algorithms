package recursion.basic;

public class Power {
    public static int power(int num, int power, int result) {
        result = result * num;
        if (power <= 1) {
            return result;
        }
        return power(num, power - 1, result);
    }
}
