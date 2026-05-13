class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int open = 0;
      
     for(char c:s.toCharArray()){
          if(c=='('&&open++>0){
            str.append('(');
           

          }
          if(c==')'&& open-->1){
            str.append(')');
           
          }
        }
        return str.toString();
    }
}