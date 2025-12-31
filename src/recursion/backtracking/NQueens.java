package recursion.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
    public static void nQueens(int[][] board, int row, int n) {
        if (row == n) {
            for (int[] eachRow : board) {
                System.out.println(Arrays.toString(eachRow));
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++) {
            if (canPlaceQueen(board, row, i, n)) {
                board[row][i] = 1;
                nQueens(board, row + 1, n);
                board[row][i] = 0;
            }
        }
    }

    private static boolean canPlaceQueen(int[][] board, int row, int column, int n) {
        for (int i = 0; i < row; i++) {
            if (board[i][column] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = column + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    public static List<List<Integer>> nQueensWithIndexes(int[][] board, int row, int n, List<Integer> indexes) {
        if (row == n) {
            for (int[] eachRow : board) {
                System.out.println(Arrays.toString(eachRow));
            }
            System.out.println(indexes);
            return List.of(indexes);
        }
        List<List<Integer>> coordinates = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (canPlaceQueen(board, row, i, n)) {
                board[row][i] = 1;
                indexes.add(row, i);
                coordinates.addAll(nQueensWithIndexes(board, row + 1, n, indexes));
                indexes.remove(row);
                board[row][i] = 0;
            }
        }
        return coordinates;
    }
}
