package Matrix;
//https://leetcode.com/problems/game-of-life/
class Solution {
    public void gameOfLife(int[][] board) {
       int[] dx={0,0,1,1,1,-1,-1,-1};
       int[] dy={1,-1,1,-1,0,0,1,-1};
       for(int row=0;row<board.length;row++){
           for(int col=0;col<board[row].length;col++){
           int count_live_neighbors=0;
           for(int i=0;i<8;i++){
               int cur_x=row+dx[i];
               int cur_y=col+dy[i];
               if(isValidNeighbor(cur_x,cur_y,board) && Math.abs(board[cur_x][cur_y])==1){
                   count_live_neighbors++;
               }
           }
               if(board[row][col]==1 && (count_live_neighbors<2 || count_live_neighbors>3)){
                   board[row][col]=-1;
               }
               if(board[row][col]==0 && count_live_neighbors==3){
                   board[row][col]=2;
               }
           }
        }  
       for(int row=0;row<board.length;row++){
          for(int col=0;col<board[row].length;col++){
              if(board[row][col]>=1){
                  board[row][col]=1;
              }
              else{
                  board[row][col]=0;
              }
          } 
       }
    }
    static boolean isValidNeighbor(int x,int y,int[][] board){
        return(x>=0 && x<board.length && y>=0 && y<board[0].length);
    }
}
