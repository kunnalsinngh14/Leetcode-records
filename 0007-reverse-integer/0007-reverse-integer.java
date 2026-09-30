class Solution {
    public int reverse(int x) {
        int temp = Math.abs(x);
        long rev = 0;
        while(temp>0){
            rev = rev*10 + temp%10;
            temp = temp/10;
        }
        
        if(x<0){
            rev = rev*(-1);
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
        return (int)rev;
    }
}