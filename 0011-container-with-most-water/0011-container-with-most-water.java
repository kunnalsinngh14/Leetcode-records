class Solution {
    public int maxArea(int[] height) {
        int p=0;
        int q = height.length-1;
        int maxcap = 0;
        while(p<q){
            int cap = (Math.min(height[p],height[q]))*(q-p);
            maxcap = Math.max(cap,maxcap);
            if(height[p]>height[q]){
                q--;
            }
            else{
                p++;
            }
        }
        return maxcap;
    }
}