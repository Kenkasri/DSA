class Solution {
    public int rob(int[] nums) {
      if(nums.length==1){
        return nums[0];
      }
      if(nums.length==2){
        return Math.max(nums[0],nums[1]);
      }
        int[]ans = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
          if(i==0){
            ans[i] = nums[i];
          }else if(i==1){
           ans[i] = Math.max(nums[i],ans[0]);
          }
            else{
            ans[i] = Math.max(ans[i-2]+nums[i],ans[i-1]);
          }

        }
        return ans[nums.length-1];
    }
}