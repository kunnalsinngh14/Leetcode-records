class Solution {
    public int majorityElement(int[] nums) {
        int element = 0;
        int maxcount = 0;
        for(int i = 0 ; i < nums.length ; i ++){
            int e = nums[i];
            int count=1;
            if(i+1!=nums.length){
                for(int j = i+1; j<nums.length; j++ ){
                    if(e==nums[j]){
                        count++;
                    }
                }
            }
            if(count>maxcount){
                element  = e;
                maxcount = Math.max(maxcount,count);
            }
        }
        return element;
    }
}