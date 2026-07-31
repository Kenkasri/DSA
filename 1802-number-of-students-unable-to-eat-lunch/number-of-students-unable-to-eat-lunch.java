class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer>s = new Stack<>();
        Queue<Integer>q = new LinkedList<>();
        for(int i = 0;i<students.length;i++){
          q.add(students[i]);
        }
        for(int i = sandwiches.length-1;i>=0;i--){
          s.push(sandwiches[i]);
        }
        int i = 0;
        while(!s.isEmpty()&&i<q.size()){
          if(s.peek()==q.peek()){
            q.poll();
            s.pop();
            i=0;
          }else{
            q.add(q.poll());
            i++;
          }
        }
        return q.size();
    }
}