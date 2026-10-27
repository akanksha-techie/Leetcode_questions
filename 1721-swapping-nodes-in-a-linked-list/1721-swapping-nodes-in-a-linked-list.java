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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode a = head;
        for(int i = 1; i < k; i++){
            a = a.next;
        }
        ListNode b = a;
        ListNode c = head;
        while(b.next != null){
            b = b.next;
            c = c.next;
        }
        int temp = a.val;
        a.val = c.val;
        c.val = temp;
        return head;
    }
}