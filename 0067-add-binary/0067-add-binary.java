class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder st = new StringBuilder("");
        int endofa = a.length()-1;
        int endofb = b.length()-1;
        for(int i=Math.max(a.length(),b.length()); i>0; i--){
            int first = 0;
            if(endofa>=0){
                first = a.charAt(endofa)- '0';;
            }
            int sec = 0;
            if(endofb>=0){
                sec = b.charAt(endofb) - '0';;
            }
            int r = first+sec+carry;
            if(r==2){
                st.append(String.valueOf(0));
                carry=1;
            }
            else if(r==3){
                st.append(String.valueOf(1));
                carry=1;
            }
            else{
                st.append(String.valueOf(r));
                carry=0;
            }
            endofa--;
            endofb--;
        }
        if(carry!=0){
            st.append(String.valueOf(1));
        }
        return st.reverse().toString();
    }
}