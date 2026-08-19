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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }   
        int index = size-n;
        ListNode current = head;
        if(index==0){
            head = head.next;
        }
        else{
            for(int i = 0; i<index-1; i++){
                current = current.next;
            }
            current.next = current.next.next;
        }
        return head;
    }
}