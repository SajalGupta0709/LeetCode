class Solution {
    public int numJewelsInStones(String J, String S) {int c=0;
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            for(int j=0;j<J.length();j++){
                char ch2=J.charAt(j);
                if(ch==ch2) {c++; break;}
            }
        }
        return c;                                              
    }
}