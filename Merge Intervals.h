class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& inter) {
        vector<vector<int>> mer;
        if(inter.size()==0) return mer;
        sort(inter.begin(),inter.end());
        vector <int> temp=inter[0];
        for (auto it: inter){
            if(it[0]<=temp[1])
                 temp[1]=max(it[1],temp[1]);
            else {
                mer.push_back(temp);
                temp=it;
            }
        }
        mer.push_back(temp);
        return mer;
    }
};
