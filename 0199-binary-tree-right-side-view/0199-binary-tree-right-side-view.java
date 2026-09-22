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
    List<Integer> arr = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        striver(root,0);
        return arr;
    }
    public void striver(TreeNode root, int level){
        if(root==null){
            return;
        }
        else if(arr.size()==level){
            arr.add(root.val);
        }
        striver(root.right, level+1);
        striver(root.left, level+1);
    }
}