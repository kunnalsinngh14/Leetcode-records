class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            left[i] = 1;
            if(i==0){
                continue;
            }
            left[i] = nums[i-1] * left[i-1];
        }
       for(int i = nums.length - 1; i >= 0; i--) {

    right[i] = 1;

    if(i == nums.length - 1) {
        continue;
    }

    right[i] = nums[i+1] * right[i+1];
}
        for(int i=0; i<nums.length; i++){
            nums[i] = left[i] * right[i];
        }
        return nums;
    }
}