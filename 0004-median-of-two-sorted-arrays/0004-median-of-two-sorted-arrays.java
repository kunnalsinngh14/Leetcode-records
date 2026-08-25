class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums1.length; i++){
            list.add(nums1[i]);
        }
        for(int i = 0; i<nums2.length; i++){
            list.add(nums2[i]);
        }
        Collections.sort(list);
        int len = nums1.length + nums2.length;
        double median = 0;
        if (len%2==0){
            int ind1 = len/2 - 1;
            int ind2 = ind1 + 1;
            median = (list.get(ind1) + list.get(ind2) );
            median = median/2;
        }
        else{
            int ind = len/2;
            median = list.get(ind);
        }
        return median;
    }
}