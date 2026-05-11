class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        int count = 0;
        while(i<nums.length){
            if(nums[i]!=0){
              int n = nums[i];
              nums[j] = n;
              i++;
              j++;
            }else{
              i++;
              count++;
            }
        }
          int n = nums.length-count;
        while(n<nums.length){
        
          nums[n] = 0;
          n++;
        }
        
    }
}