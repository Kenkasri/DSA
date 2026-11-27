class Solution {
    public int[] twoSum(int[] numbers, int target) {
     
      //   int start = 0;
      //   int end = numbers.length-1;
      //  while(numbers[start] + numbers[end] != target){
      //   if(numbers[start]+numbers[end]<target) start++;
      //   else end--;
      //  }
      //  return new int[] {start+1,end+1};

      int left = 0;
      int right = numbers.length-1;
      while(left<right){
        if(numbers[left]+numbers[right]==target){
         break;
        }else if(numbers[left]+numbers[right]<target){
          left++;
        }else{
          right--;
        }
      }
        return new int[]{left+1,right+1};
    }
}