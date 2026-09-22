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
    int bleftlvl = 0;
    int bleftval = 0;
    public int findBottomLeftValue(TreeNode root) {
        bleftval = root.val;
        helper(root,0);
        return bleftval;
    }
    public void helper(TreeNode root, int level){
        if(root==null){
            return;
        }
        if(bleftlvl<level){
            bleftlvl = level;
            bleftval = root.val;
        }
        helper(root.left, level+1);
        helper(root.right, level+1);
    }
}