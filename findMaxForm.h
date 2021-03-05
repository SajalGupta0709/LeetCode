class Solution {
public:
    int findMaxForm(vector<string>& strs, int m, int n) {
        vector<vector<int>> dp(m+1, vector<int>(n+1, 0));
        for(int i=1;i<=strs.size();i++){
            for(int j=m;j>=0;j--){
                for(int k=n;k>=0;k--){
                    int m1=0;
                    int n1=0;
                    for(char c: strs[i-1]){
                        if(c=='0'){
                            m1++;
                        }else{
                            n1++;
                        }
                    }
                    if(j>=m1 && k>=n1){
                        dp[j][k] = max(dp[j][k], 1 + dp[j-m1][k-n1]);
                    }
                }
            }   
        }
        return dp[m][n];  
    }
};
