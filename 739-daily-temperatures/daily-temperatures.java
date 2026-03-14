class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[]ans = new int[temperatures.length];
        Stack<Integer>s = new Stack<>();
        for(int i = 0;i<temperatures.length;i++){
          ans[i] = 0;
          while(!s.isEmpty()&&temperatures[s.peek()]<temperatures[i]){
            int ind = s.pop();
            ans[ind] = i-ind;
          }
          s.push(i);
        }
        return ans;
    }
}