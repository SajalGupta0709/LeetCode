class Solution {
    public void setZeroes(int[][] mat) {
        Boolean iscol=false;
        int r=mat.length;
        int c=mat[0].length;
        for(int i=0;i<r;i++){
            if(mat[i][0]==0) iscol=true;
            for(int j=1;j<c;j++){
                if(mat[i][j]==0){
                    mat[i][0]=0;
                    mat[0][j]=0;
                }
            }
        }
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(mat[i][0]==0 || mat[0][j]==0) mat[i][j]=0;
            }
        }
        if(mat[0][0]==0)
            for(int j=0;j<c;j++)
                mat[0][j]=0;
        if(iscol)
            for(int i=0;i<r;i++)
                mat[i][0]=0;
        
    }
}
