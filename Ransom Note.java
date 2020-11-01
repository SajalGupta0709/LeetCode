class Solution {
    public boolean canConstruct(String r, String m) {
        int fr[]=new int[26];
        for(int i=0;i<26;i++) fr[i]=0;
        for(int i=0;i<r.length();i++){
            int ch=(int)r.charAt(i)-'a';
            fr[ch]+=1;  }
        for(int i=0;i<m.length();i++){
            int ch=(int)m.charAt(i)-'a';
            fr[ch]-=1;
        }
        for(int i=0;i<26;i++) {
            if(fr[i]>0) return false;   
        }
        
    return true;
    }
}
