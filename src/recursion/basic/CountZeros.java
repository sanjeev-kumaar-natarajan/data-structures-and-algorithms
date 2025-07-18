package recursion.basic;

public class CountZeros {
    public static int countZeros(int num, int count) {
        if (num == 0)
            return count;
        if (num % 10 == 0) {
            return countZeros(num / 10, ++count);
        } else {
            return countZeros(num / 10, count);
        }
    }
}
