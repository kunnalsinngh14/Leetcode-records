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
    ArrayList<Integer> list = new ArrayList<>();
    public void recoverTree(TreeNode root) {
        inorder(root);
        Collections.sort(list);
        recover(root);
    }
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    int index = 0;
    public void recover(TreeNode root){
        if(root==null){
            return;
        }
        recover(root.left);
        root.val = list.get(index);
        index++;
        recover(root.right);
    }
}
