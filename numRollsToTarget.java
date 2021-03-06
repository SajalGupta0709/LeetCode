class Solution {
    final int MOD = 1000000007;
    public int numRollsToTarget(int d, int f, int target) {
        int[][] dp = new int[d + 1][target + 1];
        dp[0][0] = 1;
        for(int i = 1; i <= d; i++){
            for(int j = 1; j <= target; j++){
                int ans = 0;
                for(int k = 1; k <= f && j - k >= 0; k++){
                    ans = (ans + dp[i - 1][j - k]) % MOD;
                }
                dp[i][j] = ans;
            }
        }
        return dp[d][target];
    }
}
