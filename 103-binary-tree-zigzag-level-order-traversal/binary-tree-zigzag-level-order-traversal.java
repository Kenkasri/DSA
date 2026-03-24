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
        List<List<Integer>>result = new ArrayList<>();
        if(root==null){
          return result;
        }
        Queue<TreeNode>q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
          List<Integer>list = new ArrayList<>();
          int size = q.size();
          for(int i = 0;i<size;i++){
            TreeNode n = q.poll();
            list.add(n.val);
            if(n.left!=null) 
              q.add(n.left);
            if(n.right!=null) 
              q.add(n.right);
          }
          if(flag==true){
            Collections.reverse(list);

          }
          result.add(new ArrayList<>(list));
          flag = !flag;
        }
        return result;
    }
}