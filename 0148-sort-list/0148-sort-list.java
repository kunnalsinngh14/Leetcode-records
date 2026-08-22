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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        while (head != null) {
            arr.add(head.val);
            head = head.next;
        }
        Collections.sort(arr);
        ListNode newhead = null;
        ListNode tail = null;
        for (int i = 0; i < arr.size(); i++) {
            int n = arr.get(i);
            ListNode temp = new ListNode(n);
            if (newhead == null) {
                newhead = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }
        return newhead;
    }
}