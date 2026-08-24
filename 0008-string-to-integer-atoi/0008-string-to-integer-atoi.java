class Solution {
    public int myAtoi(String s) {
        int sign = 1;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!st.isEmpty() && (ch == '+' || ch == '-')) {
                break;
            }

            else if (st.isEmpty() && (ch == '+' || ch == '-')) {
                if ((i + 1) < s.length() &&
                    (!Character.isDigit(s.charAt(i+1))) ){
                        break;
                    }

                if (ch == '-') {
                    sign = -1;
                }
            }

            else if (!st.isEmpty() && ch == ' ') {
                break;
            }

            else if (ch == ' ') {
                continue;
            }

            else if (!Character.isDigit(ch)) {
                break;
            }

            else {
                st.push(ch);
            }
        }

    Stack<Integer> temp = new Stack<>();

    while(!st.isEmpty())
    {
        temp.push(st.pop() - '0');
    }

    long num = 0;

    while(!temp.isEmpty())
    {   

        if(sign*num<Integer.MIN_VALUE)
        {
            return sign*Integer.MIN_VALUE;
        }

        if (sign*num > Integer.MAX_VALUE){
            return sign*Integer.MAX_VALUE;
        }
        num = num * 10 + temp.pop();
    }    
    
    if(sign*num<Integer.MIN_VALUE)
        {
            return sign*Integer.MIN_VALUE;
        }

    if (sign*num > Integer.MAX_VALUE){
        return sign*Integer.MAX_VALUE;
    }
    
    return(int)(num*sign);
}}