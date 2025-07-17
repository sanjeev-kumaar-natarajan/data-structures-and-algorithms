package recursion;

import recursion.basic.*;

public class RecursionDriver {
    public static void main(String[] args) {
        int n = 5;
        int[] nums = {1, 2, 3, 4, 5};
        String str = "Sanjeev";
        //System.out.println(BinarySearch.binarySearch(nums, 0, nums.length - 1, 1));
        //System.out.println(Fibonacci.fibonacciRecursion(n));
        //System.out.println(Fibonacci.fibonacci(n));
        //System.out.println(Factorial.factorial(n));
        //System.out.println(Sum.sum(n));
        //System.out.println(StringReverse.reverse(str));
        //System.out.println(Power.power(5, 3, 1));
        System.out.println(Digits.sumOfDigits(543));
        System.out.println(Digits.productOfDigits(89));
    }
}
