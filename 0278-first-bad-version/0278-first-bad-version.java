/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int ans = 0;
        while(right>=left){
            int mid = left + (right - left) / 2;
            boolean checker = isBadVersion(mid);
            if(checker==false){
                left = mid+1;
            } 
            else{
                ans = mid;
                right=mid-1;
            }
        }
        return ans;
    }
}