class Solution {
    public int countCommas(int n) {
        int comma = 0;
        if(n<=999){
            return comma;
        }
        int increment = 1;
        int start = 1000;
        for(int i = 1000; i<=n; i++){
            if(i==start*1000){
                increment++;
                start = start*1000;
            }
            comma+= increment;
        }
        return comma;
    }
}