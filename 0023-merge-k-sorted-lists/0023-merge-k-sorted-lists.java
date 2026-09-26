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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList <Integer> arr = new ArrayList<>();
        for(int i = 0; i<lists.length; i++){
            // for(int j = 0; j<lists[i].length;j++){
            //     arr.add(lists[i][j]);
            // }
            ListNode temp = lists[i];
            while (temp != null) {
                arr.add(temp.val);
                temp = temp.next;
            }
        }
        if (arr.size() == 0) {
            return null;
        }
        Collections.sort(arr);
        ListNode head = new ListNode(arr.get(0));
        ListNode temp = head;
        ListNode tail = head;
        
        for(int i = 1; i<arr.size(); i++){
            tail = new ListNode(arr.get(i));
            temp.next = tail;
            temp = tail;      
        }
        return head;
    }
}