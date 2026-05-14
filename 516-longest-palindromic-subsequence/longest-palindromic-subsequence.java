class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][]arr = new int[n+1][n+1];
       
        for(int i = 1;i<=n;i++){
           int k = s.length()-1;
          for(int j = 1;j<=n;j++){
            if(s.charAt(i-1)==s.charAt(k)){
              arr[i][j] = arr[i-1][j-1]+1;
            }else{
              arr[i][j] = Math.max(arr[i-1][j],arr[i][j-1]);
            }
            k--;
          }
         
        }
        return arr[n][n];
    }
}