class Solution {
    public int minCostToMoveChips(int[] p) {
        int o=0,e=0;
        for(int i=0;i<p.length;i++){
            if(p[i]%2==0)e++;
            else o++;
        }
        if(e>o)return o;
            else return e;
    }
}
