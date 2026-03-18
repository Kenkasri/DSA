/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  public void right(TreeNode root, List<Integer>result,int i){
    if(root==null){
      return;
    }
    
   if(i==result.size()){
     result.add(root.val);
   }
    
     right(root.right,result,i+1);
      right(root.left,result,i+1);
  }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>result = new ArrayList<>();
        right(root,result,0);
        return result;
    }
}