class Solution {
  public int backtrack(int[][]grid,int r,int c){
    if(r<0||r>=grid.length||c<0||c>=grid[0].length||grid[r][c]==0){
      return 0;
    }
    int count=1;
    grid[r][c]=0;
   count +=  backtrack(grid,r+1,c);
   count  +=   backtrack(grid,r-1,c);
   count +=  backtrack(grid,r,c+1);
   count +=  backtrack(grid,r,c-1);
    
    return count;

  }
    public int maxAreaOfIsland(int[][] grid) {
      if(grid.length==0){
        return 0;
      }
        
        int r  = grid.length;
        int c = grid[0].length;
        int max = 0;
        int count = 0;
        for(int i = 0;i<r;i++){
          for(int j = 0;j<c;j++){
            if(grid[i][j]==1){
            count =   backtrack(grid,i,j);
 
            }
            if(count>max){
              max = count;
            }
          }
        }
        return max;
    }
}