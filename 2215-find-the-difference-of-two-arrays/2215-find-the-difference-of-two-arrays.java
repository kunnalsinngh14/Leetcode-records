class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int n : nums1){
            if(!set1.contains(n)){
                set1.add(n);
            }
        }
        for(int n : nums2){
            if(!set2.contains(n)){
                set2.add(n);
            }
        }
        List<Integer> arr = new ArrayList<>();
        Set<Integer> checkset = new HashSet<>();
        for(int n : nums1){
            if(set2.contains(n)){
                continue;
            }
            if(!checkset.contains(n)){
            checkset.add(n);
            arr.add(n);
            }
        }
        List<Integer> arr1 = new ArrayList<>();
        Set<Integer> checkset2 = new HashSet<>();
        for(int n : nums2){
            if(set1.contains(n)){
                continue;
            }
            if(!checkset2.contains(n)){
            checkset2.add(n);
            arr1.add(n);
            }
        }
        result.add(arr);
        result.add(arr1);
        return result;
    }
}