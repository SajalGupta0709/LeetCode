class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        int i=s.length()-1,c=1;
        String s1="",a="";
        while(i>=0){
            if(s.charAt(i)!=' ')
            { c=0; s1=s.substring(i,i+1)+ s1;}
            else if(c==0){
                c=1;
                a+=s1+" ";
                s1="";
            }
            i--;
        }
        if(s1!="") a+=s1;
        return (a);
    }
}
