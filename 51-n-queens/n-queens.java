class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result=new ArrayList<>();
        char[][] board = new char[n][n];

        for(int i=0;i<n;i++){
          Arrays.fill(board[i],'.');
        }
        solve(board,result,0);
        return result;

    }

    void solve(char[][] board,List<List<String>> result,int row){
      if(board.length == row){
        ArrayList<String> li = new ArrayList<>();
        for(int i=0;i<board.length;i++){
          li.add(new String(board[i]));
        }
        result.add(li);
      }

      for(int col=0;col<board.length;col++){
        if(check(row,col,board)){
          board[row][col]='Q';
          solve(board,result,row+1);
          board[row][col]='.';
        }
      }
    }

    boolean check(int row,int col,char[][] board){
      for(int i=0;i<row;i++){
        if(board[i][col]=='Q'){
          return false;
        }
      }

      for(int i=row-1,j=col-1 ;i>=0 && j>=0 ; i--,j-- ){
        if(board[i][j]=='Q'){
          return false;
        }
      }

      for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
        if(board[i][j]=='Q'){
          return false;
        }
      }

      return true;
    }
}