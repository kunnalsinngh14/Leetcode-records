class Solution {
    public int lengthOfLongestSubstring(String s) {
          if (s.length() == 0) {
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        int maxlen = 1;
        int left = 0;
        int right= 0;
        while(left<s.length()&&right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxlen = Math.max(maxlen, (right-left)+1);
                right++;
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxlen;
    }
}