class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
      HashSet<List<Integer>> set = new HashSet<>(); 
      Arrays.sort(nums);
      if(nums.length<=3){
        List<List<Integer>> result = new ArrayList<>();
        return result;
      }
      for(int i = 0; i<nums.length-3; i++)  {
            int p = i+1;
            while(p<nums.length-2){
                int left = p+1;
                int right = nums.length-1;
                while(left<right){
                    long sum = (long) nums[i] + nums[p] + nums[left] + nums[right];
                    if(sum==target){
                        set.add(Arrays.asList(nums[i],nums[p],nums[left],nums[right]));
                        left++;
                        right--;
                    }
                    else if(sum<target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
                p++;
            }
        }
        List<List<Integer>> result = new ArrayList<>(set);
        return result;
    }
}