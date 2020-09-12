class Solution {
public:
    int maxProduct(vector<int>& n) {
        int maxv=n[0],minv=n[0],r=n[0];
        for(int i=1;i<n.size();i++){
            if(n[i]<0) swap(maxv,minv);
            maxv=max(maxv*n[i],n[i]);
            minv=min(minv*n[i],n[i]);
            r=max(maxv,r);
        }
        return r;
    }
};
