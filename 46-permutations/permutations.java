class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>result = new ArrayList<>();
        List<Integer>temp = new ArrayList<>();
        permutation(nums,result,temp);
        return result;
    }
    public void permutation(int[]nums,List<List<Integer>>result,List<Integer>cur){
      if(cur.size()==nums.length){
        result.add(new ArrayList<>(cur));
        return;
      }
 for(int j = 0;j<nums.length;j++){
  if(!cur.contains(nums[j])){
     cur.add(nums[j]);
  }else{
    continue;
  }
      
      permutation(nums,result,cur);
      cur.remove(cur.size()-1);
    }
    }
}