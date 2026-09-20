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
    public boolean isSymmetric(TreeNode root) {
        if(root.left==null && root.right == null){
            return true;
        }
        else if(root.left==null & root.right != null){
            return false;
        }
        else if(root.right==null & root.left != null){
            return false;
        }
        
        else if(root.left.val!=root.right.val){
            return false;
        }
        boolean ans = isMirror(root.left,root.right);
        return ans;
    }
    public boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        else if (left == null || right == null) {
            return false;
        }
        else if (left.val != right.val) {
            return false;
        }
        return isMirror(left.left, right.right)&& isMirror(left.right, right.left);
    }
}