package Matrix;
import java.util.*;
//https://leetcode.com/problems/lucky-numbers-in-a-matrix/
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
       List<Integer> list=new ArrayList<>();
       int row=matrix.length;
       int col=matrix[0].length; 
       int[] rows=new int[row];
       int[] cols=new int[col];
       Arrays.fill(rows,1<<30);
       for(int i=0;i<row;++i){
           for(int j=0;j<col;++j){
               rows[i]=Math.min(rows[i],matrix[i][j]);
               cols[j]=Math.max(cols[j],matrix[i][j]);
           }
       }
       for(int i=0;i<row;++i){
           for(int j=0;j<col;++j){
               if(rows[i]==cols[j]){
                   list.add(rows[i]);
               }
            }
        }
        return list;     
    }
}
