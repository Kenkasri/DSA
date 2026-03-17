class Solution {
  public void solve(List<List<Integer>>res, List<Integer>temp,int[]candidates,int target,int i){
    if(target==0){
      res.add(new ArrayList<>(temp));
      return;
    }
    if(target<0){
      return;
    }
    for(int ind = i;ind < candidates.length;ind++){
        // if(candidates[ind]>target){
        //   continue;
        // }
        temp.add(candidates[ind]);
        solve(res,temp,candidates,target-candidates[ind],ind);
        temp.remove(temp.size()-1);
    }
  }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>res = new ArrayList<>();
        List<Integer>temp = new ArrayList<>();
        solve(res,temp,candidates,target,0);
        return res;

    }
}



 