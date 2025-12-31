package recursion.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WordBreak {
    public static List<String> wordBreak(String s, List<String> wordDict) {
        return check(s, 0, 0, new ArrayList<String>(), wordDict);
    }

    private static List<String> check(String s, int start, int end, List<String> currentWords, List<String> wordDict) {
        if (start >= s.length()) {
            StringBuilder currentSentence = new StringBuilder();
            for (String word : currentWords) {
                currentSentence.append(word).append(" ");
            }
            return List.of(currentSentence.toString().trim());
        }
        if (end >= s.length()) {
            return List.of();
        }
        List<String> wordList = new ArrayList<>();
        if (wordDict.contains(s.substring(start, end + 1))) {
            currentWords.add(s.substring(start, end + 1));
            wordList.addAll(check(s, end + 1, end + 1, currentWords, wordDict));
            currentWords.remove(currentWords.size() - 1);
        }
        wordList.addAll(check(s, start, end + 1, currentWords, wordDict));
        return wordList;
    }
}
