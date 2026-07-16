class Solution {

    int[][] dp = new int[101][101];

    public int uniquePaths(int m, int n) {

        if (m == 1 || n == 1)
            return 1;

        if (dp[m][n] != 0)
            return dp[m][n];

        int left = uniquePaths(m - 1, n);
        int right = uniquePaths(m, n - 1);

        dp[m][n] = left + right;

        return dp[m][n];
    }
}