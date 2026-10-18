/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    ListNode curr = new ListNode();
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null){
            return null;
        }
     TreeNode root = new TreeNode();
        root = creation(root,head);
        curr = head;
        recover(root,head);
        return root;
    }
    
    public void recover(TreeNode root, ListNode head){
        if(root==null){
            return;
        }
        recover(root.left,head);
        root.val = curr.val;
        curr = curr.next;
        recover(root.right,head);
    }

    public TreeNode creation(TreeNode root, ListNode head){
        ListNode list = head;
        Queue<TreeNode> q = new LinkedList<>();
        root = new TreeNode(list.val);
        q.offer(root);
        while(!q.isEmpty() && list!=null){
            TreeNode temp = q.poll();
            if(list.next!=null){
                    temp.left = new TreeNode(list.next.val);
                    q.offer(temp.left);
                }
            list = list.next;
            if(list != null && list.next != null){
                temp.right = new TreeNode(list.next.val);
                q.offer(temp.right);
            }
            if (list != null) {
               list = list.next;
            }
            
        }
        return root;
    }
}