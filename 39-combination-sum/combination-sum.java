class Solution {
  public void function(int[]candidates,int target,List<List<Integer>>result,List<Integer>com,int i){
    if(target==0){
      result.add(new ArrayList<>(com));
      return;
    }
    if(target<0){
      return;
    }
    for(int index = i;index<candidates.length;index++){
       com.add(candidates[index]);
       function(candidates,target-candidates[index],result,com,index);
       com.remove(com.size()-1);
    }
  }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>>result = new ArrayList<>();
       List<Integer>com = new ArrayList<>();
       function(candidates,target,result,com,0); 
       return result;
    }
}