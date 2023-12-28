package Math;
//https://leetcode.com/problems/rectangle-area/
class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);

        int cx1 = Math.max(ax1, bx1);
        int cy1 = Math.max(ay1, by1);
        int cx2 = Math.min(ax2, bx2);
        int cy2 = Math.min(ay2, by2);

        int cl = cx2- cx1;
        int cw = cy2 - cy1;

        int commonArea = Math.max(0,cl) * Math.max(0, cw);
        return area1 + area2 - commonArea;
    }
}
