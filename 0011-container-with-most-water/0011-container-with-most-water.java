class Solution {
    public int maxArea(int[] height) {
        // Arrays.sort(height);
        int maxarea = 0;
        int left=0;
        int right = height.length - 1;
        while(left<right){
            int area = Math.min(height[left], height[right]) * (right - left);
            maxarea = Math.max(area,maxarea);
            if(height[left]>height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return maxarea;
    }
}