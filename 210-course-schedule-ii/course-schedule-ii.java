class Solution {
    public int[] findOrder(int v, int[][] p) {
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        for(int i = 0;i<v;i++){
          adj.add(new ArrayList<>());
        }
        for(int[]num :p){
          adj.get(num[1]).add(num[0]);
        }
        int[]ind = new int[v];
        for(int i = 0;i<v;i++){
          for(int n:adj.get(i)){
            ind[n]++;
          }
        }
        Queue<Integer>q = new  LinkedList<>();
        for(int i = 0;i<v;i++){
          if(ind[i]==0){
            q.add(i);
          }
        }
        int[]arr = new int[v];
        int i= 0;
        while(!q.isEmpty()){
          int n = q.poll();
          arr[i++] = n;
           for(int ne : adj.get(n)){
                ind[ne]--;
               if(ind[ne] == 0){
                     q.add(ne);
    }
}
        }
        if(i!=v){
          return new int[0];
        }
    return arr;

    }
}