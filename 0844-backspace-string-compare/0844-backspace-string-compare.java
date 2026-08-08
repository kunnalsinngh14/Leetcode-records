class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack <Character> st1 = new Stack<>();
        Stack <Character> st2 = new Stack<>();
        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(!st1.isEmpty() && ch=='#'){
                st1.pop();
            }
            else{
                if(ch!='#'){
                    st1.push(ch);
                }
            }
        }
        for(int i = 0; i< t.length(); i++){
            char ch = t.charAt(i);
            if(!st2.isEmpty() && ch=='#'){
                st2.pop();
            }
            else{
                if(ch!='#'){
                    st2.push(ch);
                }
            }
        }
        if(st1.size()!=st2.size()){
            return false;
        }
        int n = st1.size();
        for(int i = 0; i< n; i++){
            char st1char = st1.pop();
            char st2char = st2.pop();
            if(st1char!=st2char){
                return false;
            } 
        }
        return true;
    }
}