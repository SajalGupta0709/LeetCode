class Solution {
    public int maxProfit(int[] a) {
        if(a.length==1||a.length==0) return 0;
        int s=a[0],l=a[0],b=0; 
        for(int i=1;i<a.length;i++){
            if(a[i]<s){s=a[i];l=a[i];}
            if(a[i]>s&&l<a[i]) l=a[i];
            if(b<l-s)b=l-s;
        }
        return b;
    }
}
