package Binary_Search;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s = 0;
        int e = n;

        while (s < e) {
            int m = s + (e - s) / 2;
            if (s == e)
                break;
            else if (isBadVersion(m) && !isBadVersion(m - 1)) {
                return m;
            } else if (!isBadVersion(m)) {
                s = m + 1;
            } else {
                e = m;
            }

        }
        return s;
    }
}
