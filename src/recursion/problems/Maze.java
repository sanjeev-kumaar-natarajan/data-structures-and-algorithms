package recursion.problems;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    public static int countWaysInMaze(int row, int column) {
        if (row == 1 || column == 1) {
            return 1;
        }
        int count = 0;
        count += countWaysInMaze(row - 1, column);
        count += countWaysInMaze(row, column - 1);
        return count;
    }

    public static List<String> waysInMaze(String processed, int row, int column) {
        if (row == 1 && column == 1) {
            return List.of(processed);
        }
        ArrayList<String> ways = new ArrayList<>();
        if (row != 1) {
            ways.addAll(waysInMaze(processed + 'D', row - 1, column));
        }
        if (column != 1) {
            ways.addAll(waysInMaze(processed + 'R', row, column - 1));
        }
        return ways;
    }

    public static List<String> waysInMazeDiagonal(String processed, int row, int column) {
        if (row == 1 && column == 1) {
            return List.of(processed);
        }
        ArrayList<String> ways = new ArrayList<>();
        if (row > 1) {
            ways.addAll(waysInMazeDiagonal(processed + 'D', row - 1, column));
        }
        if (row > 1 && column > 1) {
            ways.addAll(waysInMazeDiagonal(processed + 'C', row - 1, column - 1));
        }
        if (column > 1) {
            ways.addAll(waysInMazeDiagonal(processed + 'R', row, column - 1));
        }
        return ways;
    }

    public static List<String> waysInMazeWithObstacles(String processed, int row, int column, int[][] maze) {
        if (row == 2 && column == 2) {
            return List.of(processed);
        }
        ArrayList<String> ways = new ArrayList<>();
        if (row < 2 && maze[row + 1][column] != -1) {
            ways.addAll(waysInMazeWithObstacles(processed + 'D', row + 1, column, maze));
        }
        if (row < 2 && column < 2 && maze[row + 1][column + 1] != -1) {
            ways.addAll(waysInMazeWithObstacles(processed + 'C', row + 1, column + 1, maze));
        }
        if (column < 2 && maze[row][column + 1] != -1) {
            ways.addAll(waysInMazeWithObstacles(processed + 'R', row, column + 1, maze));
        }
        return ways;
    }
}
