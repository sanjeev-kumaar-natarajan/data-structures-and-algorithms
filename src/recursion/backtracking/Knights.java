package recursion.backtracking;

import searching.problems.binarySearch.ArrangeCoins;

import java.util.Arrays;

public class Knights {
    public static int kKnights(int[][] board, int row, int column, int knights) {
        if (knights == 0) {
            for (int[] eachRow : board) {
                System.out.println(Arrays.toString(eachRow));
            }
            System.out.println();
            return 1;
        }
        if (row == board.length) {
            return 0;
        }
        if (column == board.length) {
            return kKnights(board, row + 1, 0, knights);
        }
        int count = 0;

        if (canPlaceKnight(board, row, column)) {
            board[row][column] = 1;
            count += kKnights(board, row, column + 1, knights - 1);
            board[row][column] = 0;
        }
        count += kKnights(board, row, column + 1, knights);
        return count;
    }

    static int[][] knightMoves = {
            {2, 1}, {2, -1}, {-2, 1}, {-2, -1},
            {1, 2}, {-1, 2}, {1, -2}, {-1, -2}
    };

    static boolean isValidCoOrdinate(int row, int column, int n) {
        return row >= 0 && column >= 0 && row < n && column < n;
    }

    static boolean canPlaceKnight(int[][] board, int row, int column) {
        for (int[] moves : knightMoves) {
            int newRow = row + moves[0];
            int newColumn = column + moves[1];
            if (isValidCoOrdinate(newRow, newColumn, board.length) && board[newRow][newColumn] == 1) {
                return false;
            }
        }
        return true;
    }
}
