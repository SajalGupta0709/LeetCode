class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> S = new Stack<>();
    
        Map<Integer,Integer> M = new HashMap<>();

        S.push(-1);

        for(int i=nums2.length-1;i>=0;i--){
            while(nums2[i]>S.peek() && S.size()>1)
                S.pop();
            M.put(nums2[i],S.peek());

            S.push(nums2[i]);

        }

        for(int i=0;i<nums1.length;i++)
            nums1[i] = M.get(nums1[i]);

        return nums1;
    }
}
