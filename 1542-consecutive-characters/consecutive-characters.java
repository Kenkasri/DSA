class Solution {
    public int maxPower(String s) {
           int max = 0;
           int count = 0;
           char ch = s.charAt(0);
           for(char c:s.toCharArray()){
            if(ch!=c){
              ch = c;
              count=1;
            }else if(ch==c){
              count++;
            }
            max = Math.max(max,count);
           }
          return max;


    }
}