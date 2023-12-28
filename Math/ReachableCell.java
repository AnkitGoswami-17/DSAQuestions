package Math;
//https://leetcode.com/problems/determine-if-a-cell-is-reachable-at-a-given-time/
class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int rowDistance = Math.abs(fx - sx);
        int colDistance = Math.abs(fy - sy);
        int minDistance = Math.max(colDistance, rowDistance);

        if ((minDistance == 0) && (t == 1)) {
            return false;
        }
        if (minDistance > t) {
            return false;
        }
        return true;
    }
}
