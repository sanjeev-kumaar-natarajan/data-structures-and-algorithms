package recursion.basic;

public class ReverseDigits {
    public static int reverseDigits(int num, int reverse) {
        reverse = reverse * 10 + num % 10;
        if (num / 10 == 0)
            return reverse;
        return reverseDigits(num / 10, reverse);
    }
}
