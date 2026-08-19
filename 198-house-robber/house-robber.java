class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
          return nums[0];
        }
        if(nums.length==2){
          return Math.max(nums[0],nums[1]);
        }
        int[]dp = new int[nums.length];
        for(int i = 0;i<nums.length;i++)
        {
          if(i==0){
            dp[i] = nums[i];
          }else if(i==1){
            dp[i] = Math.max(nums[i],nums[i-1]);
          }else{
            dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);
          }
        }
        return dp[nums.length-1];
    }
}