package recursion.subset;

public class RemoveA {
    public static String removeA(String str, int index, String result) {
        if (index == str.length())
            return result;
        if (str.charAt(index) != 'a' && str.charAt(index) != 'A') {
            result += str.charAt(index);
        }
        return removeA(str, ++index, result);
    }
}
