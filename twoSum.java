class Solution {
    public int[] twoSum(int[] n, int t) {
        int r[]=new int[2];
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<n.length;i++){
            if(map.containsKey(t-n[i])){
                r[1]=i;
                r[0]=map.get(t-n[i]);
                return r;
            }
            map.put(n[i],i);
        }
    return r;
    }
}
