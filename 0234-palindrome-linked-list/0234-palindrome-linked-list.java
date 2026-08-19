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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        ListNode current = head;
        while(temp!=null){
            st.push(temp.val);
            temp = temp.next;
        }
        while(!st.isEmpty()){
            int k = st.pop();
            if(k!=current.val){
                return false;
            }
            current = current.next;
        }
        return true;
    }
}