class Solution {
  public int gcd(int a,int b){
    if(b==0){
      return a;
    }
    return gcd(b,a%b);
  }
    public int minOperations(int[] nums, int[] numsDivide) {
      
         int minCommonDiv = 0;
        for(int i = 0;i<numsDivide.length;i++){
          minCommonDiv =  gcd(minCommonDiv,numsDivide[i]);
        }
         Arrays.sort(nums);
        for(int i =0;i<nums.length;i++){
          if(minCommonDiv%nums[i]==0){
            return i;
          }
        }
       
        return -1;
    }
}