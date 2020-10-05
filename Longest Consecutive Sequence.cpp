class Solution {
    public int longestConsecutive(int[] a) {
        Set<Integer> s=new HashSet<Integer>();
        for(int i=0;i<a.length;i++)
            s.add(a[i]);
        int lon=0;
        for(int num:a){
            if(!s.contains(num-1)){
                int cnum=num;
                int count=1;
                while(s.contains(cnum+1)){
                    cnum+=1; count+=1;
                }
                if(count>lon) lon=count;
            }
        }
        return lon;
    }
}
