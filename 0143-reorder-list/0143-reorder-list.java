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
    public void reorderList(ListNode head) {
        ListNode curr = head;
        ListNode tail = head;
        while(tail.next!=null){
            tail = tail.next;
        }
        while(curr!=tail){
            tail.next = curr.next;
            curr.next = tail;
            ListNode temp = tail;

            curr = tail.next;
            while(temp.next!=tail){
            temp = temp.next;
            }
            tail =temp;
            tail.next = null;
        }        
    }
}