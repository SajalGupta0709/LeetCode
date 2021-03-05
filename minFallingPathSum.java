class Solution {
    public int minFallingPathSum(int[][] m) {
        int row=m.length, col=m[0].length;
        int dp[][]=new int[row][col];
        for(int i=1;i<row;i++)
            for(int j=0;j<col;j++){
                if(j!=0&&j<col-1)
                    m[i][j]+=Math.min(m[i-1][j-1],Math.min(m[i-1][j],m[i-1][j+1]));
                else if(j==0)
                    m[i][0]+=Math.min(m[i-1][0],m[i-1][1]);
                else if(j==col-1)
                    m[i][j]+=Math.min(m[i-1][j],m[i-1][j-1]);
            }   
        int min=m[row-1][0];
        for(int i=1;i<col;i++)
            min=Math.min(min,m[row-1][i]);
        return min;
    }
}
