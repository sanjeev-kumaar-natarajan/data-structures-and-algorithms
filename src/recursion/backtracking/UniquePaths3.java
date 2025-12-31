package recursion.backtracking;

import java.util.List;

public class UniquePaths3 {
    public static int uniquePathsIII(int[][] grid) {
        List<Integer> indexes = getIndex(grid);
        int row = indexes.get(0);
        int column = indexes.get(1);
        grid[row][column] = 0;
        return backtrack(row, column, grid, 0, countSquares(grid));
    }

    private static int backtrack(int row, int column, int[][] grid, int steps, int targetSteps) {

        if (!isSafe(row, column, grid)) {
            return 0;
        }

        if (grid[row][column] == 2) {
            if (steps == targetSteps) {
                return 1;
            } else {
                return 0;
            }
        }

        int count = 0;
        grid[row][column] = 1;
        count += backtrack(row + 1, column, grid, steps + 1, targetSteps);
        count += backtrack(row - 1, column, grid, steps + 1, targetSteps);
        count += backtrack(row, column + 1, grid, steps + 1, targetSteps);
        count += backtrack(row, column - 1, grid, steps + 1, targetSteps);
        grid[row][column] = 0;
        return count;

    }

    private static boolean isSafe(int row, int column, int[][] grid) {
        if (row < 0 || column < 0 || row >= grid.length || column >= grid[row].length) {
            return false;
        }
        if (grid[row][column] == 1 || grid[row][column] == -1) {
            return false;
        }
        return true;
    }

    private static int countSquares(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    private static List<Integer> getIndex(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    return List.of(i, j);
                }
            }
        }
        return List.of(-1, -1);
    }
}
