class Solution {
    public int firstUniqChar(String s) {
        String r="";
        for(int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i),i+1)==-1 && r.indexOf(s.charAt(i))==-1)
                return i;
            r+=s.charAt(i);
        }
    return -1;}
}