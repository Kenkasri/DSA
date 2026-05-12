class Solution {
    public String largestOddNumber(String num) {
      String ans = num;
      for(int i = num.length()-1;i>=0;i--){
      char c = num.charAt(i);
      if((c-'0')%2==1){
       break;
      }else{
        ans = ans.substring(0,i);
      }
      }
      return ans;
    }
}