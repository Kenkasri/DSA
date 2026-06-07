class Solution {
  public int countop(int n1,int n2,int c){
    if(n1==0||n2==0){
      return c;
    }
    if(n1<n2){
     return countop(n1,n2-n1,c+1);
    }else{
      return countop(n1-n2,n2,c+1);
    }
  }
    public int countOperations(int num1, int num2) {
        return countop(num1,num2,0);
    }
}