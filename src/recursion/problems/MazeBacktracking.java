package recursion.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MazeBacktracking {
    public static List<String> mazeBacktracking(String processed, int row, int column, boolean[][] backtracking) {
        if (row == 2 && column == 2) {
            return List.of(processed);
        }
        backtracking[row][column] = false;

        ArrayList<String> ways = new ArrayList<>();
        if (row < 2 && backtracking[row + 1][column]) {

            ways.addAll(mazeBacktracking(processed + 'D', row + 1, column, backtracking));

        }
        if (row > 0 && backtracking[row - 1][column]) {

            ways.addAll(mazeBacktracking(processed + 'U', row - 1, column, backtracking));

        }
        if (column < 2 && backtracking[row][column + 1]) {

            ways.addAll(mazeBacktracking(processed + 'R', row, column + 1, backtracking));

        }
        if (column > 0 && backtracking[row][column - 1]) {

            ways.addAll(mazeBacktracking(processed + 'L', row, column - 1, backtracking));

        }

        backtracking[row][column] = true;

        return ways;
    }

    public static List<String> mazeBacktrackingPrintMatrix(String processed, int row, int column, int[][] backtracking, int level) {
        if (row == 2 && column == 2) {
            backtracking[row][column] = ++level;
            for (int[] rowLevel : backtracking) {
                System.out.println(Arrays.toString(rowLevel));
            }
            backtracking[row][column] = 0;
            System.out.println("---------                                                                                          ");
            return List.of(processed);
        }
        backtracking[row][column] = ++level;
        ArrayList<String> ways = new ArrayList<>();
        if (row < 2 && backtracking[row + 1][column] == 0) {

            ways.addAll(mazeBacktrackingPrintMatrix(processed + 'D', row + 1, column, backtracking, level));

        }
        if (row > 0 && backtracking[row - 1][column] == 0) {

            ways.addAll(mazeBacktrackingPrintMatrix(processed + 'U', row - 1, column, backtracking, level));

        }
        if (column < 2 && backtracking[row][column + 1] == 0) {

            ways.addAll(mazeBacktrackingPrintMatrix(processed + 'R', row, column + 1, backtracking, level));

        }
        if (column > 0 && backtracking[row][column - 1] == 0) {

            ways.addAll(mazeBacktrackingPrintMatrix(processed + 'L', row, column - 1, backtracking, level));

        }

        backtracking[row][column] = 0;
        return ways;
    }
}
