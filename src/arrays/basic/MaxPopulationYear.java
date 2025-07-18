package arrays.basic;

/**
 * Leetcode -1854
 */
public class MaxPopulationYear {
    public static int maximumPopulation(int[][] logs) {
        int[] years = new int[100];
        for (int i = 0; i < logs.length; i++) {
            int birthYear = logs[i][0];
            int deathYear = logs[i][1];
            for (int year = birthYear - 1950; year < deathYear - 1950; year++) {
                years[year]++;
            }
        }
        int max = -1;
        for (int i = 0; i < years.length; i++) {
            max = Math.max(max, i);
        }
        return max;
    }
}
