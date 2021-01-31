class Solution {
    public int[] countBits(int num) {
        int res[]=new int[num+1];
        res[0]=0; 
        if(num==0) return res;
        res[1]=1;
        for(int i=2;i<=num;i++){
            res[i]=res[i/2];
            if(i%2!=0) res[i]++;
        }
        return res;
    }
}
