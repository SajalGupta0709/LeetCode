class Solution {
    public int majorityElement(int[] n) {
        int c=1,a=1,s=n[0];
        Arrays.sort(n);
        for(int i=1;i<n.length;i++){
            if(n[i]==n[i-1]) c++;
            else c=1;
            if(a<c) {s=n[i]; a=c;}
        }
   return s; }
}