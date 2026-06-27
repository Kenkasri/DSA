class Solution {
    public int trap(int[] arr) {
        // int[]left = new int[height.length];
        // int[]right = new int[height.length];
        // int max1 = 0;
        // int max2 = 0;
        // for(int i = 0;i<height.length;i++){
        //  max1 = Math.max(height[i],max1);
        //   left[i] = max1;
        // }
        // for(int i = height.length-1;i>=0;i--){
        //    max2 = Math.max(height[i],max2);
        //   right[i] = max2;
        // }
        // int sum = 0;
        // for(int i = 0;i<height.length;i++){
        //  if(left[i]<=right[i]){
        //   sum += left[i]-height[i]; 
        //  }else{
        //     sum += right[i]-height[i];
        //  }
        // }
        // return sum;


  int left  = 0;
        int right= arr.length-1;
        int leftmax = 0;
        int rightmax = 0;
        int water = 0;

        while(left<right){
            if(arr[left]<arr[right]){
                if(leftmax<=arr[left]){
                    leftmax = arr[left];
                }else{
                    water += leftmax - arr[left];
                }
                left++;
            }else{
                if(rightmax<=arr[right]){
                    rightmax = arr[right];
                }else{
                    water += rightmax - arr[right];
                }
                right--;
            }
        }
return water;
        
    }
}