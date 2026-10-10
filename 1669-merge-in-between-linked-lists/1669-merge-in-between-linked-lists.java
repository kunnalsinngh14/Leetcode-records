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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode tempofstart = list1;
        int i = 0;
        while(i<a-1){
            tempofstart = tempofstart.next;
            i++;
        }
        ListNode tempofend = tempofstart;
        while(i<b){ //i=2
            tempofend = tempofend.next;
            i++;
        }
        tempofend = tempofend.next;
        tempofstart.next = list2;
        while(list2.next != null){
            list2 = list2.next;
        }
        list2.next = tempofend;
        return list1;
    }
}