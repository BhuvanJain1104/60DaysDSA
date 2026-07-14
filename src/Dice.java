public class Dice {
    int MOD = 1000000007;
    Integer[][] dp;

    public int numRollsToTarget(int n, int k, int target) {

        dp = new Integer[n + 1][target + 1];

        return solve(n, k, target);
    }

    private int solve(int diceLeft, int faces, int target) {

        if (diceLeft == 0 && target == 0) {
            return 1;
        }

        if (diceLeft == 0 || target < 0) {
            return 0;
        }

        if (dp[diceLeft][target] != null) {
            return dp[diceLeft][target];
        }

        long count = 0;

        for (int face = 1; face <= faces && face <= target; face++) {

            count += solve(diceLeft - 1, faces, target - face);

            count %= MOD;
        }

        return dp[diceLeft][target] = (int) count;
    }
}
