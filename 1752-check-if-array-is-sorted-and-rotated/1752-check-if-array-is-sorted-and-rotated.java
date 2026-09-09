class Solution {
    public boolean check(int[] nums) {
        int max = nums[0];
        int start = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                start = i+1;
                for(int j = start; j<nums.length; j++){
                    if(nums[j]>max || nums[start]>nums[j]){
                        return false;
                    }
                    if(j+1<nums.length && (nums[i]<nums[j+1] || nums[j]>nums[j+1]))
                    {
                        return false;
                    }

                }
            }
        } 
        return true;
    }
}