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
    List<Integer>list = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        helper(root);
        int prev = list.get(0);
        for(int i = 1; i<list.size(); i++){
            int curr = list.get(i);
            if(prev>curr || prev==curr){
                return false;
            }
            prev = curr;
        }
        return true;
    }
    public void helper(TreeNode root){
        if(root==null){
            return;
        }
        helper(root.left);
        list.add(root.val);
        helper(root.right);
    }
}