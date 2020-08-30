class Solution {
public:
    int hIndex(vector<int>& citations) {
        int size = citations.size();
        if (size==0) return 0;
        
        sort(citations.begin(),citations.end(),std::greater<int>());
        int i = 0;
        while(i<size && citations[i]>=i+1){
            i++;
        }
        
        return i;
    }
};
