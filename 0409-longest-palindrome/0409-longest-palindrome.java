class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        int len = 0;
        for(int val : map.values()){
            if(val>=2){
                int temp = val%2;
                if(temp==0){
                    len+=val;
                }
                else{
                    len+=(val-1);
                }
            }
        }
        if(s.length()>len && len%2==0){
            len++;
        }
        return len;
    }
}