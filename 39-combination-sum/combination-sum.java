class Solution {
      void sum(List<List<Integer>>result,List<Integer>cur,int[]arr,int target,int i){
         if(target==0){
          result.add(new ArrayList<>(cur));
          return;
         }
         if(target<0){
          return;
         }
         for(int index = i;index<arr.length;index++){
                  cur.add(arr[index]);
                  sum(result,cur,arr,target-arr[index],index);
                  cur.remove(cur.size()-1);
         }
      }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
           List<List<Integer>>result = new ArrayList<>();
           List<Integer>cur = new ArrayList<>();
           sum(result,cur,candidates,target,0);
           return result;

    }
}