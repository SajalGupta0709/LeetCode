// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        int l=1,h=n,m;
        while(l<h){ m=l+(h-l)/2;
            bool t=isBadVersion(m);
            if(t)  h=m;
            else   l=m+1;
        }
    return l;
    }
};
