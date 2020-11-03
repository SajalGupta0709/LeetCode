class Solution {
    public List<List<Integer>> threeSum(int[] n) {
        ArrayList <List<Integer>> a=new ArrayList<List<Integer>>();
        if(n.length<3) return a;
        Arrays.sort(n);
        for(int i=0;i<n.length-2;i++){
            if(i!=0 && n[i-1]==n[i]) continue;
            int j=i+1, k=n.length-1;
            while(j<k){
                int s=n[i]+n[j]+n[k];
                if(s>0) k--;
                else if(s<0) j++;
                else{
                    a.add(Arrays.asList(n[i],n[j],n[k]));
                    while(j+1<k&& n[j+1]==n[j]) j++;
                    while(j<k-1 && n[k-1]==n[k]) k--;
                    j++; k--;
                }
            }
        }
        return a;
    }
}
