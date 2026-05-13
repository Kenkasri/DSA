class Solution {
    public String reverseWords(String s) {
        char[]arr = clearspaces(s).toCharArray();
        reverse(arr, 0, arr.length - 1);
        int start = 0;
        for(int end = 0;end<=arr.length;end++){
          if (end == arr.length || arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }
        return new String(arr);
    }
    public String clearspaces(String s){
      int i = 0;
      int n = s.length();
      StringBuilder sb = new StringBuilder();
      while(i<n&&s.charAt(i)==' ') i++;
      while(i<n){
        if(s.charAt(i)!=' '){
          sb.append(s.charAt(i));

        }else {
          sb.append(' ');
          while(i<n&&s.charAt(i)==' ')
           while (i < n && s.charAt(i) == ' ') i++; 
                continue;


        }
        i++;
      }
            if(sb.length()>0&&sb.charAt(sb.length()-1)==' '){
              sb.deleteCharAt(sb.length()-1);
            }
             return sb.toString();
    }
    public void reverse(char[]arr,int start,int last){
      while(start<last){
        char temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
        start++;
        last--;
      }
    }
}