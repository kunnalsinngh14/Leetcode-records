class Solution {
    public long countCommas(long n) {
        long comma = 0;
        int len = String.valueOf(n).length();
        if (len < 4) {
            return comma;
        } else if (len >= 4 && len < 7) {
            comma = n - 999;
        } else if (len >= 7 && len < 10) {
            comma = (999999 - 1000 + 1) + (n - 999999) * 2;
        } else if (len >= 10 && len < 13) {
            comma = (999999 - 1000 + 1) + (999999999 - 1000000 + 1) * 2 + (n - 999999999) * 3;
        } else if (len >= 13 && len < 16) {
      comma = (999999 - 1000 + 1)
      + (999999999 - 1000000 + 1) * 2
      + (999999999999L - 1000000000L + 1) * 3
      + (n - 1000000000000L+1)* 4;
        } else {
            comma = (999999 - 1000 + 1)
                    + (999999999 - 1000000 + 1) * 2
                    + (999999999999L - 1000000000L + 1) * 3
                    + (999999999999999L - 1000000000000L + 1) * 4
                    + (n - 999999999999999L) * 5;
        }
        return comma;
    }
}