package Matrix;
//https://leetcode.com/problems/reshape-the-matrix/description/
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
       int row=mat.length;
        int col=mat[0].length;
        int[][] arr=new int[r][c];

        if(row*col != r*c){
            return mat;
        }
        
        int a=0;
        int b=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[a][b]=mat[i][j];
                b++;
                if(b==c){
                    b=0;
                    a++;
                }
            }
        }
        return arr;

    }
}
