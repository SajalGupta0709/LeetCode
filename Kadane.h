class Solution {
public:
    int maxSubArray(vector<int>& a) {
        int sum=0,max=a[0];
        
        for(int i=0;i<a.size();i++){
            sum+=a[i];
            if(max<sum) max=sum;
            if(sum<0) sum=0;
        }
        return max;      
    }
};
