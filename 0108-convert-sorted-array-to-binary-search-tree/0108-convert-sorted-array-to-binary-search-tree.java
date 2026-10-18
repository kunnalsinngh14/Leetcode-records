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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = new TreeNode();
        root = creation(root,nums);
        recover(root,nums);
        return root;
    }
    int i = 0;
    public void recover(TreeNode root, int[]nums){
        if(root==null){
            return;
        }
        recover(root.left,nums);
        root.val = nums[i];
        i++;
        recover(root.right,nums);
    }


    public TreeNode creation(TreeNode root, int[]nums){
        Queue<TreeNode> q = new LinkedList<>();
        root = new TreeNode(nums[0]);
        int i = 1;
        q.offer(root);
        while(!q.isEmpty() && i<nums.length){
            TreeNode temp = q.poll();
            if(i<nums.length){
                    temp.left = new TreeNode(nums[i]);
                    q.offer(temp.left);
                }
            i++;
            if(i<nums.length){
                temp.right = new TreeNode(nums[i]);
                q.offer(temp.right);
            }
            i++;
        }
        return root;
    }
}