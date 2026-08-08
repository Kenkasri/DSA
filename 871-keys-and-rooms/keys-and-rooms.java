class Solution {
  void dfs(List<List<Integer>>list,boolean[]visited,int room){
    visited[room] = true;
    for(int key:list.get(room)){
      if(!visited[key]){
        dfs(list,visited,key);
      }
    }
  }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[]visited = new boolean[rooms.size()];
        dfs(rooms,visited,0);
        for(boolean v:visited){
          if(!v){
            return false;
          }
        }
        return true;
    }
}