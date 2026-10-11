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
    boolean ans = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        helper(0,root,targetSum);
        return ans;
    }
    public void helper(int sum, TreeNode root, int t){
        if(root==null){
            return;
        }
        sum+=root.val;
        helper(sum,root.left,t);
        helper(sum,root.right,t);
        if(sum==t && root.left == null & root.right == null){
            ans = true;
        }
    }
}