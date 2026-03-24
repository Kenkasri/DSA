class Solution {
  public void backtrack(int[][]image,int r,int c,int color,int orginal){
    if(r<0||r>=image.length||c<0||c>=image[0].length||image[r][c] != orginal ){
      return;
    }
    image[r][c] = color;
    backtrack(image,r+1,c,color,orginal);
    backtrack(image,r-1,c,color,orginal);
    backtrack(image,r,c+1,color,orginal);
    backtrack(image,r,c-1,color,orginal);
  }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
      
     if(image[sr][sc]!=color){
      int original = image[sr][sc];
      backtrack(image,sr,sc,color,original);
     }   
     return image;
    }
}