class Solution {
    public int findKthLargest(int[] nums, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i : nums){
            arr.add(i);
        }
        Collections.sort(arr, Collections.reverseOrder());
        return arr.get(k-1);
    }
}