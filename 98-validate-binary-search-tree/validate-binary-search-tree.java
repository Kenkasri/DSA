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
  // public boolean isValid(TreeNode root,long min,long max){
  //   if(root==null) return true;;
  //   if(root.val<=min||root.val>=max) return false;
  //   return isValid(root.left,min,root.val)&&isValid(root.right,root.val,max);
  // }
  public TreeNode inorder(TreeNode root,  ArrayList<Integer>list){
    if(root==null){
      return null;
    }
    inorder(root.left,list);
    list.add(root.val);
    inorder(root.right,list);
    return root;
  }
    public boolean isValidBST(TreeNode root) {
        // return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
       ArrayList<Integer>list = new ArrayList<>();
       inorder(root,list);
       for(int i = 1;i<list.size();i++){
        if(list.get(i-1)>=list.get(i)){
           return false;
        }
       }
       return true;
    }
}