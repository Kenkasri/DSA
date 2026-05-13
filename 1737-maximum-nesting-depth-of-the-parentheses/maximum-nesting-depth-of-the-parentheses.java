class Solution {
    public int maxDepth(String s) {
        int maxDepth = 0;
        int count = 0;
        for(char c :s.toCharArray()){
         if(c=='(') count++;
         if(c==')') count--;
         maxDepth  = Math.max(count,maxDepth);
        }
        return maxDepth;
    }
}