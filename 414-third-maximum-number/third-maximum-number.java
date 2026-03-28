class Solution {
    public int thirdMax(int[] nums) {
     if (nums.length == 1) {
            return nums[0];
        }

        Long firstmax = null;
        Long secmax = null;
        Long thirdmax = null;

        for (int i = 0; i < nums.length; i++) {

            if ((firstmax != null && nums[i] == firstmax) ||
                (secmax != null && nums[i] == secmax) ||
                (thirdmax != null && nums[i] == thirdmax)) {
                continue;
            }

            if (firstmax == null || nums[i] > firstmax) {
                thirdmax = secmax;
                secmax = firstmax;
                firstmax = (long) nums[i];
            } 
            else if (secmax == null || nums[i] > secmax) {
                thirdmax = secmax;
                secmax = (long) nums[i];
            } 
            else if (thirdmax == null || nums[i] > thirdmax) {
                thirdmax = (long) nums[i];
            }
        }

        return thirdmax == null ? firstmax.intValue() : thirdmax.intValue();
    }
}