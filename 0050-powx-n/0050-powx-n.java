class Solution {
    public double myPow(double x, int n) {
        long power = n;
        if(power==0){
            return 1.00000;
        }
       // if(power>Integer.MAX_VALUE){
        //     return
        // }
        // else if(power<Integer.MIN_VALUE){
        //     return
        // }        
        double result = Math.pow(x,power);
        return result;
    }
}