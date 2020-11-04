class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0,m=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) l++;
            else l=0;
            if(m<l) m=l; 
        }
        return m;
    }
}
