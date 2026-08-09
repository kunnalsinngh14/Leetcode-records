class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> st = new Stack<>();
        for(int i = 0; i<tokens.length; i++){
            String ch = tokens[i];
            if(!ch.equals("+") && !ch.equals("-") && !ch.equals("*") && !ch.equals("/")){
                st.push(Integer.parseInt(ch));
            }
            else{
                int i1 = st.pop();
                int i2 = st.pop();
                if(ch.equals("+")){
                    st.push(i1+i2);
                }
                if(ch.equals("-")){
                    st.push(i2-i1);
                }
                if(ch.equals("*")){
                    st.push(i1*i2);
                }
                if(ch.equals("/")){
                    st.push(i2/i1);
                }
            }
        }
        int ans = st.peek();
        return ans;
    }
}