class Solution {
    public int maximalSquare(char[][] m) {
        int r=m.length,c=m[0].length;int max=0;
        int dp[][]=new int[r+1][c+1];
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(m[i-1][j-1]=='1'){
                    dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i][j-1]))+1;
                    max=Math.max(max,dp[i][j]);}
            }
        }
        return max*max;
    }
}
