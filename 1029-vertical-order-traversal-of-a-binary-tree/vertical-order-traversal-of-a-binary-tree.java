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
 class Pair {
    TreeNode node;
    int hd;   // horizontal distance (column)
    int lvl;  // level (row)
    Pair(TreeNode node, int hd, int lvl) {
        this.node = node;
        this.hd = hd;
        this.lvl = lvl;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
         List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        // TreeMap<HD, TreeMap<Level, PriorityQueue of nodes>>
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0, 0));

        while (!q.isEmpty()) {
            Pair curr = q.poll();

            map.putIfAbsent(curr.hd, new TreeMap<>());
            map.get(curr.hd).putIfAbsent(curr.lvl, new PriorityQueue<>());
            map.get(curr.hd).get(curr.lvl).add(curr.node.val);

            if (curr.node.left != null)
                q.add(new Pair(curr.node.left, curr.hd - 1, curr.lvl + 1));
            if (curr.node.right != null)
                q.add(new Pair(curr.node.right, curr.hd + 1, curr.lvl + 1));
        }

        // Build final result
        for (TreeMap<Integer, PriorityQueue<Integer>> levels : map.values()) {
            List<Integer> col = new ArrayList<>();
            for (PriorityQueue<Integer> nodes : levels.values()) {
                while (!nodes.isEmpty()) col.add(nodes.poll());
            }
            result.add(col);
        }

        return result;
    }
}