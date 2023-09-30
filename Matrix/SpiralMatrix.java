package Matrix;
//https://leetcode.com/problems/spiral-matrix-ii/
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;
        int temp=1;
        while(left<=right && top<=bottom){
            for(int row=left;row<=right;row++){
                res[top][row]=temp;
                temp++;
            }
            top++;
            for(int col=top;col<=bottom;col++){
                res[col][right]=temp;
                temp++;
            }
            right--;
            for(int row=right;row>=left;row--){
                res[bottom][row]=temp;
                temp++;
            }
            bottom--;
            for(int col=bottom;col>=top;col--){
                res[col][left]=temp;
                temp++;
            }
            left++;
        }
        return res;
    }
}
