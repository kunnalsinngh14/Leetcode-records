class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] arr = s.split("\\s+");
        String st = "";
        for(int i = arr.length-1; i>=0; i--){
            st = st+arr[i];
            st = st+" ";
        }
        st = st.trim();
        return st;
    }
}