class Solution {
    public int trap(int[] h) {
        int l=0,r=h.length-1;
        int lm=0,rm=0,a=0;
        while(l<r){
            if(h[l]<h[r]){
                if(h[l]>=lm) lm=h[l];
                else
                    a+=lm-h[l];
                l++;
            }
            else{
                if(h[r]>=rm) rm=h[r];
                else    a+=rm-h[r];
                r--;
            }
        }
        return a;
    }    
}
