class Solution {
public:
    void findNumbers(vector<int>& ar, int s, vector<vector<int> >& res, vector<int>& r, int i) {
        if(s<0) return;
        if(s==0) {
            res.push_back(r);  return;
        }
        while(i<ar.size()&&s-ar[i]>=0){
            r.push_back(ar[i]);
            findNumbers(ar, s - ar[i], res, r, i); 
            i++; 
            r.pop_back(); 
        }
    }
    vector<vector<int>> combinationSum(vector<int>& c, int s) {
        sort(c.begin(),c.end());
        vector<int> r; 
        vector<vector<int> > res; 
        findNumbers(c, s, res, r, 0); 

        return res; 
    }
};
