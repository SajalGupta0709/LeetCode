class Solution {
public:
    int countVowelStrings(int n) {
        int dp[n+1][5];
        for(int i=0;i<=4;i++)
            dp[0][i]=0;
        for(int i=0;i<=4;i++)
            dp[1][i]=1;
        int sum=5;
        for(int i=2;i<=n;i++){
            for(int j=0;j<5;j++){
                if(j==0) dp[i][0]=sum;
                else{
                    dp[i][j]=dp[i][j-1]-dp[i-1][j-1];
                    sum+=dp[i][j];
                }
            }
        }
        return sum;
    }
};
