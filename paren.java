class Solution {
    public boolean isValid(String s) {
        Stack <Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char top,ch=s.charAt(i);
            if(ch==')'||ch=='}'||ch==']'){
                if(!st.empty())
                    top=st.pop();
                else 
                    return false;
                if(top=='(') top=')';
                else if (top=='{') top='}';
                else top=']';            
                if(ch!=top) return false;
            }
            else st.push(ch);    
        }
        return st.isEmpty();
    }
}
