package Binary_Search;

class Solution {
    public int arrangeCoins(int n) {
        long s = 0;
        long e = n;
        long count = 0;
        while (s <= e) {
            long m = s + (e - s) / 2;
            if ((m * (m + 1)) / 2 <= n) {
                count = m;
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return (int) count;
    }
}