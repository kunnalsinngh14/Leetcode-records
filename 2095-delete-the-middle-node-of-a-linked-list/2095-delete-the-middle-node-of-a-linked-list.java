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
    public int count(ListNode head){
        int n = 0;
        ListNode temp = head;
        while(head!=null){
            n++;
            head = head.next;
        }
        return n; 
    }

    public ListNode deleteMiddle(ListNode head) {
        int n = count(head);
        if(n==1){
            return null;
        }
        int middle = n/2; 
        ListNode temp = head;
        for(int i = 0; i<middle-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}