class Solution {
    Stack<Character> st = new Stack<>();

    public int recursion(String s, int i) {
        String num = "";

while (!st.isEmpty() && Character.isDigit(st.peek())) {
    num = st.pop() + num;
}

int k = Integer.parseInt(num);
        int x = i + 1;

        for (int j = 0; j < k; j++) {
            x = i + 1;

            while (s.charAt(x) != ']') {

                if (s.charAt(x) == '[') {
                    x = recursion(s, x);   

                    x++;                  
                    continue;
                }

                st.push(s.charAt(x));
                x++;
            }
        }

        return x;   
    }

    public String decodeString(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '[') {
                i = recursion(s, i);       
            } else {
                st.push(ch);
            }
        }

        StringBuilder str = new StringBuilder();

        while (!st.isEmpty()) {
            str.append(st.pop());
        }

        return str.reverse().toString();
    }
}