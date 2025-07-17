package string;

public class Test {
    public static void main(String[] args) {
        String s = "1326#";
        System.out.println(freqAlphabets(s));
    }

    public static String freqAlphabets(String str) {
        StringBuilder result = new StringBuilder();
        char[] ch = str.toCharArray();
        int ab = ch[0] - 48;
        for (int i = ch.length - 1; i >= 0; i--) {
            if (i >= 2) {
                if (ch[i] == '#') {
                    int number = (ch[i - 2] - 48) * 10 + (ch[i - 1] - 48);
                    result.append((char) (number + 96));
                    i = i - 2;
                    continue;
                }
            }
            char c = (char) (ch[i] + 48);
            result.append(c);
        }
        return result.reverse().toString();
    }
}
