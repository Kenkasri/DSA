class Solution {
    public boolean rotateString(String s, String goal) {
      //   int n = s.length();
      //   if(s.length()!=goal.length()){
      //     return false;
      //   }
      //   int i = 0;
      //   while(i<n){
      //      if(s.charAt(i)==goal.charAt(0)){
      //       break;
      //      }
      //      i++;
      //   }
      //   int j  = 0;
      //  while(j<goal.length()){
      //   if(s.charAt(i)!=goal.charAt(j)){
      //     return false;
      //   }
      //   i = (i+1)%n;
      //   j++;
      //  }
      //  return true;
         int n = s.length();

        if (n != goal.length()) {
            return false;
        }
        for(int start = 0;start<n;start++){
          int j = 0;
          while(j<n&&s.charAt((start+j)%n)==goal.charAt(j)){
            j++;
          }
          if(j==n){
            return true;
          }
        }
          return false;
    }
}