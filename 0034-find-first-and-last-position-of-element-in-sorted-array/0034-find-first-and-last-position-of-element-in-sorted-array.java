class Solution {

    public int[] searchRange(int[] nums, int target) {

        int[] arr = new int[2];
        Arrays.fill(arr, -1);

        // Find first occurrence
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                arr[0] = mid;
                high = mid - 1;       // search left
            }
            else if (nums[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        // Find last occurrence
        low = 0;
        high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                arr[1] = mid;
                low = mid + 1;        // search right
            }
            else if (nums[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return arr;
    }
}