
class Solution {
    public void level(List<List<Integer>> result, TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();  // number of nodes in current level
            List<Integer> cur = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                cur.add(node.val);

                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }

            result.add(cur);
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        level(result, root);
        return result;
    }
}





