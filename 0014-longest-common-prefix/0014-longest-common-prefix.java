class Solution {
    public String longestCommonPrefix(String[] strs) {
        String st = strs[0];
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || ch != strs[j].charAt(i)) {
                    return prefix.toString();
                }
            }
            prefix.append(ch);
        }
        return prefix.toString();
    }
}