class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>adj  = new ArrayList<>();
        for(int i = 0;i<numCourses;i++){
          adj.add(new ArrayList<>());
        }
      for(int[] n:prerequisites){
       
          adj.get(n[1]).add(n[0]);

        }
      
      int[]ind = new int[numCourses];
        for(int i = 0;i<numCourses;i++){
            for(int n:adj.get(i)){
                ind[n]++;
            }
        }
        Queue<Integer>q = new LinkedList<>();
        for(int i = 0;i<numCourses;i++){
            if(ind[i]==0){
                q.add(i);
            }
        }
        int c = 0;
        while(!q.isEmpty()){
          int n = q.poll();
          c++;
          for(int ne : adj.get(n)){
                ind[ne]--;
               if(ind[ne] == 0){
                     q.add(ne);
    }
}

        }
        if(c==numCourses){
          return true;
        }
return false;
    }
}