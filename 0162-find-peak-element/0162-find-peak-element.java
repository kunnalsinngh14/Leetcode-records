class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==0 || nums.length==1){
            return 0;
        }
        // else if(nums.length==2){
        //     if(nums[0]>nums[1]){
        //         return 0;
        //     }
        //     return 1;
        // }
        int p=0;
        int q = 2;
        while(q<nums.length){
            int mid = p + (q-p)/2;
            if(nums[mid]>nums[p]&&nums[mid]>nums[q]){
                return mid;
            }
            p++;
            q++;
        }
        int prev = p;
        p++;
        if(nums[p]>nums[prev]){
            return p;
        }
        return 0;
    }
}