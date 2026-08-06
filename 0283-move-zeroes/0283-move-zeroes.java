class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int length = nums.length-1;
        while(i<length){
            if(nums[i]==0){
                for(int j = i; j<length; j++){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
                }
                length--;
            }
            else{
                i++;
            }
        }
    }
}