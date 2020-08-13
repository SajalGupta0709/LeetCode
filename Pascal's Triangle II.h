class Solution {
public:
    vector<int> getRow(int r) {
        vector <int> k;
        long long int prev = 1; 
        k.push_back(prev); 
        for (int i = 1; i <= r; i++) { 
        // nCr = (nCr-1 * (n - r + 1))/r 
        long long int curr = (prev * (r - i + 1)) / i; 
        k.push_back(curr); 
        prev = curr; 
        } 
    return k;}
};
