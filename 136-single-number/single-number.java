class Solution {
    public int singleNumber(int[] nums) {
      if(nums.length==1){
        return nums[0];
      }
      int a   = nums[0];
      for(int i  = 1;i<nums.length;i++){
        int b = nums[i];
        int result = a^b;
        a = result;
        }
        return a;
    }
}