package recursion.backtracking;

public class WordSearch {
    public static boolean exist(char[][] board, String word) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                result = check(board, i, j, word);
                if (result) {
                    return true;
                }
            }
        }
        return result;
    }

    public static boolean isSafe(int row, int column, char[][] board) {
        return row >= 0 && column >= 0 && row < board.length && column < board[row].length;
    }

    public static boolean check(char[][] board, int row, int column, String word) {
        if (word.isEmpty()) {
            return true;
        }
        if (isSafe(row, column, board) && board[row][column] == word.charAt(0)) {
            char c = board[row][column];
            board[row][column] = '-';
            if (check(board, row + 1, column, word.substring(1))) return true;
            if (check(board, row - 1, column, word.substring(1))) return true;
            if (check(board, row, column + 1, word.substring(1))) return true;
            if (check(board, row, column - 1, word.substring(1))) return true;
            board[row][column] = c;
        }
        return false;
    }
}
