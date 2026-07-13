class Solution {
    public int removeDuplicates(int[] nums) {
      //  int j = 1;
      //  for(int i = 1;i<nums.length;i++){
      //   if(nums[i]!=nums[i-1]){
      //      nums[j] = nums[i];
      //      j++;
      //   }
      //  }
      //   return j;

       if (nums.length == 0)
            return 0;

        int[] temp = new int[nums.length];

        int k = 0;

        temp[k++] = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                temp[k++] = nums[i];
            }
        }

        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }

        return k;
        }
}