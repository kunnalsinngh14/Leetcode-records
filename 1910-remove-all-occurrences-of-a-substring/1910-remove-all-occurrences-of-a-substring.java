class Solution {
    public void checksub(Stack <Character> st,char[]arr){
        int point = arr.length-1;
        int len = arr.length;
        int count = 0;
        boolean checker = true;
        ArrayList<Character> list = new ArrayList<>();
        for(int i =0; i<len;i++){

            if(st.isEmpty()){
                checker = false;
                break;
            }
            if(st.peek() == arr[point]){
                count++;
                point--;
                list.add(st.pop());
            }
            else{
                checker = false;
                break;
            }
        }
        if(checker==false){
            for(int i = count-1; i>=0; i--){
                st.push(list.get(i));
            }
        }
    }

    public String removeOccurrences(String s, String part) {
        char[] arr = part.toCharArray();
        char checkpoint = arr[arr.length-1];
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==checkpoint){
                st.push(ch);
                checksub(st,arr);
            }
            // if(check==false){
            //     while(st.peek()!=arr[0]){
            //         st.pop();
            //     }
            //     st.pop();
            // }
            else{
                st.push(ch);
            }
        } 
        StringBuilder str = new StringBuilder();
        for(char ch : st) {
            str.append(ch);
        }
        return str.toString();
    }
}