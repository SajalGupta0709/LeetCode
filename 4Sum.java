class Solution {
    public List<List<Integer>> fourSum(int[] n, int tt) {
        Arrays.sort(n);
        ArrayList<List<Integer>> r=new ArrayList<List<Integer>>();
        int l=n.length;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                int f=j+1,b=l-1,t=tt-n[i]-n[j];
                while(f<b){
                    int s=n[f]+n[b];
                    if(s<t)f++;
                    else if(s>t) b--;
                    else{
                        List<Integer> q=new ArrayList();
                        q.add(n[i]);
                        q.add(n[j]);
                        q.add(n[f]);
                        q.add(n[b]);
                        r.add(q);
                        while(f<b && n[f]==q.get(2)) f++;
                        while(f<b && n[b]==q.get(3)) b--;
                    } 
                }
               while(j+1<l && n[j+1]==n[j]) j++; 
            }
            while(i+1<l && n[i+1]==n[i]) i++;
        }
        return r;
    }
}
