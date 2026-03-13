class StockSpanner {
  //  Stack<Integer>s1 = new Stack<>();
  //  Stack<Integer>s2 = new Stack<>();
  Stack<int[]>stack = new Stack<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
      // int span = 1;
      // while(!s1.isEmpty()&&s1.peek()<=price){
      
      //   s2.push(s1.pop());
      //    span++;
      // }
     
      //  while(!s2.isEmpty()){
      //   s1.push(s2.pop());
      //  }
      //   s1.push(price);
      //  return span;
    int span = 1;
      while(!stack.isEmpty()&&stack.peek()[0]<=price){
          span+=stack.pop()[1];
          
      }
      stack.push(new int[]{price,span});
      return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */