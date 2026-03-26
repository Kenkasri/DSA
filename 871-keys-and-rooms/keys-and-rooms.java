class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        //  int n = rooms.size();
        // Queue<Integer> q = new LinkedList<>();
        // boolean[] visited = new boolean[n];
        // q.add(0);
        // visited[0] = true;
        // while(q.size()!=0){
        //     int front = q.remove();
        //     List<Integer> keys = rooms.get(front);
        //     for(int ele: keys){
        //         if(!visited[ele]){
        //             q.add(ele);
        //             visited[ele] = true;
        //         }
        //     }
        // }
        // for(boolean bool:visited){
        //     if(!bool) return bool;
        // }
        // return true;

        boolean[]visited = new boolean[rooms.size()];
        dfs(rooms,visited,0);
        for(boolean v:visited){
          if(!v) return false;
        }
        return true;
    }

    void dfs(List<List<Integer>>rooms,boolean[]visited,int room){
      visited[room]= true;
      for(int key :rooms.get(room)){
        if(!visited[key]){
          dfs(rooms,visited,key);
        }
      }
    }
}