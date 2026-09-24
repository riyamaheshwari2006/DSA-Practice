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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode i = head;
        ListNode j;
        while (i != null && i.next != null) {
            j = i.next;
            i.next = j.next;
            j.next = i;
            prev.next = j;
            prev = i;
            i = i.next;
        }
        return dummy.next;
    }
}