/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    // public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    //     if(root==null){
    //       return root;
    //     }
    //     if(p.val<root.val&&q.val<root.val){
    //       return lowestCommonAncestor(root.left,p,q);
    //     }
    //     if(p.val>root.val&&q.val>root.val){
    //       return lowestCommonAncestor(root.right,p,q);
    //     }

    //     return root;
    // }
        public TreeNode lowestCommonAncestor(TreeNode root,
                                         TreeNode p,
                                         TreeNode q) {

        List<TreeNode> pathP = new ArrayList<>();
        List<TreeNode> pathQ = new ArrayList<>();

        findPath(root, p, pathP);
        findPath(root, q, pathQ);

        int i = 0;

        while (i < pathP.size() &&
               i < pathQ.size() &&
               pathP.get(i) == pathQ.get(i)) {
            i++;
        }

        return pathP.get(i - 1);
    }

    private boolean findPath(TreeNode root,
                             TreeNode target,
                             List<TreeNode> path) {

        if (root == null) {
            return false;
        }

        path.add(root);

        if (root == target) {
            return true;
        }

        if (findPath(root.left, target, path) ||
            findPath(root.right, target, path)) {
            return true;
        }

        // Backtrack
        path.remove(path.size() - 1);

        return false;
    }
}