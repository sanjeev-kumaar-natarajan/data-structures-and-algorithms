package recursion.basic;

public class StringReverse {
    public static String reverse(String str) {
        if (str.length() < 2) {
            return str;
        }
        return reverse(str.substring(1, str.length())) + str.charAt(0);
    }
}
