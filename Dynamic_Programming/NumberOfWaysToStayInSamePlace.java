package Dynamic_Programming;

//https://leetcode.com/problems/number-of-ways-to-stay-in-the-same-place-after-some-steps/
class Solution {
    public int numWays(int steps, int arrLen) {
        int s = steps;
        int n = Math.min(steps / 2 + 1, arrLen);
        
        int[][] dp = new int[s + 1][n];
        dp[0][0] = 1;
        
        int mod = ((int)(Math.pow(10,9))) + 7;

        for (int i = 1; i <= s; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j > 0) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % mod;
                }
                if (j < n - 1) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j + 1]) % mod;
                }
            }
        }
        
        return dp[s][0];
    }
}
