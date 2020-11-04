class Solution {
public:
    int maxPower(string s) {
        int p=1,mp=1;
        for(int i=1;i<s.length();i++){
            if(s[i-1]==s[i]) p++;
            else p=1;
            if(p>mp) mp=p;
        }
        return mp;
    }
};
