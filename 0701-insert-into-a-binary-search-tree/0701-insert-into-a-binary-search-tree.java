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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            return new TreeNode(val);
        }
        TreeNode temp = new TreeNode(val);
        if(val>root.val){
            if(root.right==null){
                root.right = temp;
            }
            else{
                root.right= insertIntoBST(root.right,val);
            }
        }
        if(val<root.val){
            if(root.left==null){
                root.left = temp;
            }
            else{
                root.left = insertIntoBST(root.left,val);
            }
        }
        return root;
    }
}