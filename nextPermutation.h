class Solution {
public:
    void nextPermutation(vector<int>& n) {
        int t1=-1;
        int l=n.size();
        for(int i=n.size()-1;i>0;i--)
            if(n[i]>n[i-1]){ t1=i-1; break;}
        if(t1!=-1){
            for(int i=n.size()-1;i>=0;i--)
                if(n[i]>n[t1]) {swap(n[i],n[t1]); break;}
            int j=l-1;    
            for(int i=t1+1;i<=(t1+l)/2;i++)
                swap(n[i],n[j--]);
        }
        else     
            for(int i=0;i<l/2;i++)
                swap(n[i],n[l-1-i]);
        
    }
};
