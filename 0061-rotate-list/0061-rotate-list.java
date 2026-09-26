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
        while(head!=null){
            n++;
            head = head.next;
        }
        return n;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        int n = count(head);
        k = k%n; 
        ListNode tail = head;
        ListNode lastsec = head;

        for(int i = 0; i<k; i++){
            while(lastsec.next.next!=null){
                lastsec = lastsec.next;
            }
            tail = lastsec.next;

            tail.next = head;
            lastsec.next = null;
            
            head = tail;
            lastsec = head;
        }
        return head;
    }
}