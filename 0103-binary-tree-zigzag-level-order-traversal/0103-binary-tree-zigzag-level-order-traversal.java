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
    // Stack<TreeNode> st = new Stack<>();
    Queue<TreeNode> q = new LinkedList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null){
            return result;
        }
        q.offer(root);
        helper(q,0);
        return result;
    }
    public void helper(Queue<TreeNode> q, int flag){
        List<TreeNode> arr = new ArrayList<>();
        List<Integer> value = new ArrayList<>();
        if(q.isEmpty()){
            return;
        }
        while(!q.isEmpty()){
            arr.add(q.poll());
        }
        for(int i = 0 ; i< arr.size(); i++){
                TreeNode temp = arr.get(i);
                value.add(temp.val);
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
        }
        if(flag==1){
            Collections.reverse(value);        
            flag=0;
        }
        else{
            flag=1;
        }
        result.add(value);
        helper(q,flag);    
    }
}