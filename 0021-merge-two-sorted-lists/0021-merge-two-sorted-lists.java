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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return null;
        }
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while(p1 != null && p2 != null){
            if(p1.val <= p2.val){
                temp.next = p1;
                p1 = p1.next;
                temp = temp.next; 
            }else{
                temp.next = p2;
                p2 = p2.next;
                temp = temp.next;
            }
        }
        while(p1 != null){
            temp.next = p1;
            p1 = p1.next;
            temp = temp.next;
        }
        while(p2 != null){
            temp.next = p2;
            p2 = p2.next;
            temp = temp.next;
        }
        return dummy.next;
    }
}