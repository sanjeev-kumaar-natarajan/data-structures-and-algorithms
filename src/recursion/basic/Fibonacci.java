package recursion.basic;

/**
 * Leetcode - 509
 */
public class Fibonacci {
    public static int fibonacciRecursion(int n) {

        if (n < 2)
            return n;

        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
        
    }

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int num1 = 0;
        int num2 = 1;
        int fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = num1 + num2;
            num1 = num2;
            num2 = fib;
        }
        return fib;
    }
}
