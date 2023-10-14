package Dynamic_Programming;

//https://leetcode.com/problems/champagne-tower/
class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
       float[] prev_row = new float[]{poured};
       for(int row = 1; row <= query_row; row++) {
           float[] cur_row = new float[row + 1];
           for(int i = 0; i < row; i++) {
               float extra = prev_row[i] - 1;
               if(extra > 0) {
                   cur_row[i] += 0.5 * extra;
                   cur_row[i + 1] += 0.5 *extra;
               }
           }
           prev_row = cur_row;
       } 
       return Math.min(1, prev_row[query_glass]);
    }
}
