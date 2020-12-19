class Solution {
    public int myAtoi(String s) {
        int res=0,sign=1,i=0;
        while(i<s.length()&&s.charAt(i)==' ') i++;
        if(i<s.length()&&s.charAt(i)=='-') {sign=-1; i++;}
            else if (i<s.length()&&s.charAt(i)=='+') i++;
        while(i<s.length()&&s.charAt(i)>='0'&&s.charAt(i)<='9'){
            if (res > Integer.MAX_VALUE / 10 ||(res == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > Integer.MAX_VALUE % 10)) 
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res=res*10+(s.charAt(i++))-'0';
        }
        return res*sign;
    }
}
