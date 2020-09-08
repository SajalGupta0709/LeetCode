class Solution {
    public boolean searchMatrix(int[][] m, int t) {
        if(m.length==0) return false;
        int n=m.length;
        int l=m[0].length;
        
        int lo=0,hi=(n*l)-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(m[mid/l][mid%l]==t) return true;
            if(m[mid/l][mid%l]<t)  lo=mid+1;
            else hi=mid-1;
        }
        return false;
    }
}
