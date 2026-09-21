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
    List<List<Integer>> result = new ArrayList<>();
    Queue<TreeNode> q = new LinkedList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return result;
        }
        q.offer(root);
        level(q);
        return result;
    }
    public void level(Queue<TreeNode> q){
        List<TreeNode> arr = new ArrayList<>();
        List<Integer> values = new ArrayList<>();
        if(q.isEmpty()){
            return;
        }
        while(!q.isEmpty()){
            arr.add(q.poll());
        }
        for(int i = 0; i<arr.size(); i++){
            TreeNode temp = arr.get(i);
            values.add(temp.val);
            if(temp.left != null){
                q.offer(temp.left);
            }
            if(temp.right != null){
                q.offer(temp.right);
            }
        }
        result.add(values);
        level(q);
    }
}