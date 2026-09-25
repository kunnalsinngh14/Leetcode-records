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

    LinkedList<TreeNode> ll = new LinkedList<>();

    public void llist(TreeNode root) {
        if (root == null) {
            return;
        }

        ll.add(root);

        llist(root.left);
        llist(root.right);
    }

    public void flatten(TreeNode root) {

        if (root == null) {
            return;
        }
        llist(root);
        
        for (int i = 0; i < ll.size() - 1; i++) {

            TreeNode curr = ll.get(i);
            TreeNode next = ll.get(i + 1);

            curr.left = null;
            curr.right = next;
        }
    }
}