package arrays.problems.basic;

/**
 * LeetCode - 1672
 */
public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int wealth = calculateWealth(accounts, i);
            if (wealth > maxWealth)
                maxWealth = wealth;
        }
        return maxWealth;
    }

    public static int calculateWealth(int[][] accounts, int i) {
        int wealth = 0;
        for (int j = 0; j < accounts[i].length; j++) {
            wealth += accounts[i][j];
        }
        return wealth;
    }
}
