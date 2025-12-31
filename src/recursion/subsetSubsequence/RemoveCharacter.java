package recursion.subsetSubsequence;

public class RemoveCharacter {
    public static String removeCharacter(String str, char charToBeRemoved) {
        if (str.isEmpty())
            return "";
        if (str.charAt(0) != charToBeRemoved) {
            return str.charAt(0) + removeCharacter(str.substring(1), charToBeRemoved);
        } else {
            return removeCharacter(str.substring(1), charToBeRemoved);
        }
    }
}
