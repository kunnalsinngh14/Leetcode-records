class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        int p = 0;
        int q = s.length()-1;
        while(p<q){
            char first = s.charAt(p);
            char last = s.charAt(q);
            if(first!=last){
                return false;
            }
            p++;
            q--;
        }
        return true;
    }
}