class Solution {
    public int reverseDegree(String s) {
        char[] arr = s.toCharArray();
        int ind = 1;
        int sum = 0;
        for(int i =0; i<arr.length;i++){
            char ch = arr[i];
            int val = ch - 'z' - 1  ;
            int revval = Math.abs(val);
            sum+=revval*ind;
            ind++;
        }
        return sum;
    }
}