class Solution {
    public int bsearch(int[]nums, int target, int left, int right){
        while(left<=right){
            int mid = left + (right-left) / 2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return -1;
    }
   
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left) / 2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>=nums[left]){
                if(target<=nums[mid] && nums[left]<=target){
                    int ans = bsearch(nums,target,left,mid);
                    return ans;
                }
                left = mid+1;
            }
            else{
                if(nums[mid]<nums[right]){
                    if(target<=nums[right] && target>nums[mid]){
                        int ans = bsearch(nums,target,mid,right);
                        return ans;  
                    }
                }
                right = mid - 1;
            }
        }
        return -1;
    }
}