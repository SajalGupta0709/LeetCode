class Solution {
    public List<Integer> majorityElement(int[] a) {
        int n1=-1,n2=-1,c1=0,c2=0,l=a.length;
        for(int i=0;i<l;++i){
            if(a[i]==n1) c1++;
            else if(a[i]==n2) c2++;
            else if(c1==0){
                c1=1; 
                n1=a[i];
            }
            else if(c2==0){
                c2=1; n2=a[i];
            }
            else { c2--;c1--;}        
        }
        List<Integer> ans=new ArrayList<Integer>();
        c1=0;c2=0;
        for(int i=0;i<l;i++){
            if(a[i]==n1) c1++;
            else if(a[i]==n2) c2++;
        }
        if(c1>l/3) ans.add(n1);
        if(c2>l/3) ans.add(n2);
        return ans;
    }
}
