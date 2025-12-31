package recursion.backtracking;

import recursion.array.LinearSearch;

import java.util.ArrayList;
import java.util.List;

public class BacktrackingDriver {
    public static void main(String[] args) {
        //NQueens.nQueens(new int[4][4], 0, 4);
        //System.out.println(NQueens.nQueensWithIndexes(new int[4][4], 0, 4, new ArrayList<>()));
        //System.out.println(Knights.kKnights(new int[3][3], 0, 0, 5));
        /*int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        Sudoku.sudokuSolver(board, 0, 0);*/
        /*char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        System.out.println(WordSearch.exist(board, "ABCB"));*/
        //System.out.println(WordBreak.wordBreak("pineapplepenapple", List.of("apple", "pen", "applepen", "pine", "pineapple")));
        //System.out.println(UniquePaths3.uniquePathsIII(new int[][]{{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 2, -1}}));
        System.out.println(CombinationSum2.combinationSum2(new int[]{2, 5, 2, 1, 2}, 5));
    }
}
