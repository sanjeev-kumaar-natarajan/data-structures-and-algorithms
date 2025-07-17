package recursion.basic;

public class Digits {
    public static int sumOfDigits(int n) {
        if (n / 10 == 0) {
            return n;
        }
        return sumOfDigits(n / 10) + n % 10;
    }

    public static int productOfDigits(int n) {
        if (n / 10 == 0) {
            return n;
        }
        return productOfDigits(n / 10) * (n % 10);
    }

}
