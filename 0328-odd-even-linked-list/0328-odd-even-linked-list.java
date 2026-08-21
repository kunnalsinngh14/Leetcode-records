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
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null){
            return head;
        }
        ListNode result = head;
        ListNode oddnode = head;
        ListNode evennode = head.next;
        ListNode connectornode = head.next;
        while(oddnode.next!=null && evennode.next!=null){
           oddnode.next = evennode.next;
            oddnode = evennode.next;

            evennode.next = oddnode.next;
            evennode = oddnode.next;
        }
        oddnode.next = connectornode;
        return result;
    }
}