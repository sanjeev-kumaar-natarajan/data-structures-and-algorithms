package recursion.backtracking;

import java.util.Arrays;

public class Sudoku {
    static int getStartIndex(int n) {
        if (n >= 0 && n < 3) {
            return 0;
        } else if (n >= 3 && n < 6) {
            return 3;
        } else {
            return 6;
        }
    }

    static boolean canPlaceInBox(int[][] board, int row, int column, int number) {
        int rowStart = getStartIndex(row);
        int columnStart = getStartIndex(column);
        for (int i = rowStart; i < rowStart + 3; i++) {
            for (int j = columnStart; j < columnStart + 3; j++) {
                if (board[i][j] == number) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean canPlaceNumber(int[][] board, int row, int column, int number) {
        for (int i = 0; i < row; i++) {
            if (board[i][column] == number) {
                return false;
            }
        }
        for (int i = row + 1; i < board.length; i++) {
            if (board[i][column] == number) {
                return false;
            }
        }
        for (int i = 0; i < column; i++) {
            if (board[row][i] == number) {
                return false;
            }
        }
        for (int i = column + 1; i < board.length; i++) {
            if (board[row][i] == number) {
                return false;
            }
        }
        return canPlaceInBox(board, row, column, number);
    }

    private static boolean boardFilled(int[][] board) {
        for (int[] row : board) {
            for (int j = 0; j < board.length; j++) {
                if (row[j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void sudokuSolver(int[][] board, int row, int column) {
        if (row == board.length) {
            for (int[] eachRow : board) {
                System.out.println(Arrays.toString(eachRow));
            }
            System.out.println();
            return;
        }
        if (column == board.length) {
            sudokuSolver(board, row + 1, 0);
            return;
        }
        if (board[row][column] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (canPlaceNumber(board, row, column, i)) {
                    board[row][column] = i;
                    sudokuSolver(board, row, column + 1);
                    board[row][column] = 0;
                }
            }
        } else {
            sudokuSolver(board, row, column + 1);
        }
    }
}
