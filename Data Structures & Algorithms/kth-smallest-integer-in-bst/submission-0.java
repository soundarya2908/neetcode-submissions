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
    Queue<Integer> queue = new PriorityQueue();
    public int kthSmallest(TreeNode root, int k) {
        traverse(root);

        for (int i = 0; i < k - 1; i++) {
            queue.poll();
        }

        return queue.poll();
    }

    private void traverse(TreeNode root) {
        if (root == null) return;
        queue.add(root.val);

        traverse(root.left);
        traverse(root.right);
    }
}
