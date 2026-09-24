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
    Stack<Integer> st = new Stack<>();
    List<List<Integer>> result = new ArrayList<>();
    // int maxh = 0;
    // public int height(TreeNode root){
    //     if(root==null){
    //         return 0;
    //     }
    //     int l = height(root.left);
    //     int r = height(root.right);
    //     int h = Math.max(l,r);
    //     maxh = Math.max(maxh, h+1);
    //     return h+1;
    // }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        // int h = height(root);
        helper(root,targetSum, 0);
        return result;
    }
    public boolean checker(TreeNode root){
        if(root.left==null && root.right==null){
            return true;
        }
        return false;
    }
    public void helper(TreeNode root, int target, int sum){
        if(root == null){
            return;
        }
        st.push(root.val);
        sum+=root.val;
        helper(root.left,target,sum);
        helper(root.right,target,sum);
        if(sum==target && checker(root)==true){
            result.add(new ArrayList<>(st));
        }
        sum-=root.val;
        st.pop();
    }
}