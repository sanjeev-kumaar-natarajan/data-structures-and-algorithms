package recursion.subsetSubsequence;

public class RemoveString {

    public static String removeString(String str, String stringToBeRemoved) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.startsWith(stringToBeRemoved)) {
            return removeString(str.substring(stringToBeRemoved.length()), stringToBeRemoved);
        } else {
            if (!str.contains(stringToBeRemoved)) {
                return str;
            }
            return str.substring(0, str.indexOf(stringToBeRemoved)) + removeString(str.substring(str.indexOf(stringToBeRemoved)), stringToBeRemoved);
        }
    }

    public static String removeStringNotBase(String str, String stringToBeRemoved, String baseString) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.startsWith(stringToBeRemoved) && !str.startsWith(baseString)) {
            return removeStringNotBase(str.substring(stringToBeRemoved.length()), stringToBeRemoved, baseString);
        } else if (str.startsWith(stringToBeRemoved)) {
            return stringToBeRemoved + removeStringNotBase(str.substring(stringToBeRemoved.length()), stringToBeRemoved, baseString);
        } else {
            if (!str.contains(stringToBeRemoved)) {
                return str;
            }
            return str.substring(0, str.indexOf(stringToBeRemoved))
                    + removeStringNotBase(str.substring(str.indexOf(stringToBeRemoved)),
                    stringToBeRemoved, baseString);
        }
    }

}
