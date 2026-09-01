class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums1.length; i++){
            map.put(nums1[i], map.getOrDefault(nums1[i], 0)+1);
        }
        for(int i = 0; i<nums2.length; i++){
            if(map.containsKey(nums2[i])){
                set.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i])-1);
                if(map.get(nums2[i])==0){
                    map.remove(nums2[i]);
                }
            }
        }
        int[] arr = set.stream().mapToInt(Integer::intValue).toArray();
        return arr;
   }
}