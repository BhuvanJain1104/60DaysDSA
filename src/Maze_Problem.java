import java.util.Arrays;

public class Maze_Problem {
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


        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            int m = obstacleGrid.length;
            int n = obstacleGrid[0].length;

            // If start or destination is blocked
            if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1)
                return 0;

            for (int[] row : dp)
                Arrays.fill(row, -1);

            return helper(obstacleGrid, m - 1, n - 1);
        }

        public int helper(int[][] obstacleGrid, int i, int j) {

            // Outside grid
            if (i < 0 || j < 0)
                return 0;

            // Obstacle
            if (obstacleGrid[i][j] == 1)
                return 0;

            // Start cell
            if (i == 0 && j == 0)
                return 1;

            // Memoization
            if (dp[i][j] != -1)
                return dp[i][j];

            int left = helper(obstacleGrid, i - 1, j);
            int right = helper(obstacleGrid, i, j - 1);

            dp[i][j] = left + right;

            return dp[i][j];
        }

}
