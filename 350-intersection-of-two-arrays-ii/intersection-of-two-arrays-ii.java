class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      
        // ArrayList<Integer>ans = new ArrayList<>();
        // int j = 0;
      
        // if(nums1.length>nums2.length){
        //   for(int i = 0;i<nums1.length&&j<nums2.length;i++){
        //     if(nums1[i]==nums2[j]){
        //      ans.add(nums1[i]);
        //        j++;
        //     }
           
        //   }
        // }else{
        //   for(int i = 0;i<nums2.length&&j<nums1.length;i++){
        //     if(nums1[j]==nums2[i]){
        //    ans.add(nums1[j]);
        //       j++;
        //     }
            
        //   }
        // }
        // int[] num = new int[ans.size()];

        // for(int i = 0;i<ans.size();i++){
        //   num[i] = ans.get(i);
        // }
        // return num;







     Arrays.sort(nums1);
     Arrays.sort(nums2);
     ArrayList<Integer>ans = new ArrayList<>();
     int i = 0;
     int j = 0;
     while(i<nums1.length&&j<nums2.length){
      if(nums1[i]==nums2[j]){
        ans.add(nums1[i]);
        i++;
        j++;
      }else if(nums1[i]<nums2[j]){
        i++;
      }else{
        j++;
      }
     }
        
    int[] num = new int[ans.size()];
    for(int k = 0;k<ans.size();k++){
          num[k] = ans.get(k);
        }
        return num;


    }
}