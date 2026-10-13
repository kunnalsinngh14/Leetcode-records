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
    Queue<TreeNode> q = new LinkedList<>();
    List<Integer> arr = new LinkedList<>();
    
    public List<Integer> largestValues(TreeNode root) {
        if(root==null){
            return arr;
        }
        q.add(root);
        helper(root);
        return arr;
    }
    public void helper(TreeNode root){
        List<TreeNode> list = new LinkedList<>();
        if(q.isEmpty()){
            return;
        }
        while(!q.isEmpty()){
            list.add(q.poll());
        }
        int maxval = Integer.MIN_VALUE;
        for(int i = 0; i<list.size();i++){
            TreeNode temp = list.get(i);
            if(temp.val>maxval){
                maxval = temp.val;
            }
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
        arr.add(maxval);
        if(root.left!=null){
        helper(root.left);
        }if(root.right!=null){
        helper(root.right);
        }
    }
}