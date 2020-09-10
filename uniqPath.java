class Solution {
    public int uniquePaths(int m, int n) {
        m--;n--;
        int f=m+n;
        double r=1;
        for(int i=1;i<=m;i++)
            r=r*(f-m+i)/i;
        return (int)r;
    }
}
