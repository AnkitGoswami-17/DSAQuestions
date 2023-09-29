package Matrix;
//https://leetcode.com/problems/word-search/description/
class Solution {
    public boolean visited[][];
    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int col=board[0].length;

        visited = new boolean[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(word.charAt(0)==board[i][j] && searchWord(i,j,0,board,word)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean searchWord(int i,int j,int start,char[][] board,String word){
       
        if(start == word.length()){
            return true;
        }
        if(i<0||i>=board.length||j<0||j>=board[i].length||word.charAt(start)!=board[i][j]||
        visited[i][j]){
            return false;
        }
            visited[i][j]=true;
        if(
            searchWord(i+1,j,start+1,board,word)||
            searchWord(i-1,j,start+1,board,word)||
            searchWord(i,j+1,start+1,board,word)||
            searchWord(i,j-1,start+1,board,word)){
                return true;
            }
        visited[i][j]=false;
        return false;
    }
}
