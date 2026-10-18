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
    PriorityQueue<Integer> q = new PriorityQueue<>();
    public int findSecondMinimumValue(TreeNode root) {
        inorder(root);
        Set<Integer> set = new HashSet<>(q);
        if(set.size()<2){
            return -1;
        }
        PriorityQueue<Integer> ans = new PriorityQueue<>(set);
        ans.poll();
        return ans.peek();
        
    }
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        q.offer(root.val);
        inorder(root.right);
    }
}