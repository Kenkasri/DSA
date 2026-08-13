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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      boolean flag = false;
     
        List<List<Integer>>list = new ArrayList<>();
        if(root == null){
      return list;
     }
     Queue<TreeNode>q = new LinkedList<>();
     q.add(root);
     while(!q.isEmpty()){
      int s = q.size();
      List<Integer>l = new ArrayList<>();
      for(int i = 0;i<s;i++){
        TreeNode temp = q.poll();
        if(temp.left!=null){
               q.add(temp.left);
        }
         if(temp.right!=null){
               q.add(temp.right);
        }
        l.add(temp.val);

      }

        if(flag==true){
          Collections.reverse(l);
        }
        list.add(new ArrayList<>(l));
        flag = !flag;
     }   
     return list;
    }
}