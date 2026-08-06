import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxcount = 0;
        int majority = nums[0];
        for (int i = 0; i < nums.length; i++) {

            if (set.contains(nums[i])) {
                continue;
            } else {
                int count = 0;
                set.add(nums[i]);

                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }

                if (count > maxcount) {
                    maxcount = count;
                    majority = nums[i];
                }
            }
        }

        return majority;
    }
}