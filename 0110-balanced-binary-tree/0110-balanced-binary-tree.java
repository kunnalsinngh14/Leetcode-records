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
    public boolean isBalanced(TreeNode root) {
        int result = height(root);
        if(result==-1){
            return false;
        }
        return true;
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftheight = height(root.left);
        if(leftheight==-1){
            return -1;
        }

        int rightheight = height(root.right);
        if(rightheight==-1){
            return -1;
        }
        int ans = Math.abs(leftheight-rightheight);
        if(ans<=1){
            return Math.max(leftheight, rightheight) + 1;
        }
        return -1;
    }
}