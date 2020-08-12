class Solution {
    public int findComplement(int num) {
        String s="",r="";
        while(num>0){
            s+=num%2;
            num/=2;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') r+="0";
            else r+="1";
        }
        int n=0;
        for(int i=0;i<r.length();i++){
            char c=r.charAt(i);
            n+=Character.getNumericValue(c)*Math.pow(2,i);
        }
    return n;}
}