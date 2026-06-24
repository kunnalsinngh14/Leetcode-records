class Solution {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int i = 0;
        while(i<length){
            int p = nums[i];
            // int q = nums[i+1];
            if(p==0){
                int j = i;
                while(j<length-1){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
                j++;
                }
            length--;
            }
            else{
                i++;
            }
        }
    }
}