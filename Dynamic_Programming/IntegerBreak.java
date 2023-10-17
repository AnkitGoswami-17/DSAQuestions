package Dynamic_Programming;

//https://leetcode.com/problems/integer-break/
class Solution {
    public int integerBreak(int n) {
        if (n <= 3){
            return n - 1; 
        }
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n ; i++) {
            if (i == n) {
                dp[i] = 0;
            } else {
                dp[i] = i;
            }
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], (dp[j] * dp[i - j]));
            }
        }
        return dp[n];
    }
}
