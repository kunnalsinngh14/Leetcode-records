class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char key = s.charAt(i);
            if (key=='(' || key=='[' || key=='{' ){
                if(key=='('){
                   st.push(')');
                }
                else if (key=='['){
                    st.push(']');
                }
                else{
                    st.push('}');
                }
            }
            else{
                if(st.empty()){
                    return false;
                }
                else if (key!=st.peek()){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        if(st.empty()){
            return true;
        }
        else{
            return false;
        }
    }
}