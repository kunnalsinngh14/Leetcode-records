class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int j = 1;
        for(int i  = 0; i<nums.length; i++){
            if(!set.contains(j)){
                return j;
            }
            j++;
        }
        return j;
    }
}