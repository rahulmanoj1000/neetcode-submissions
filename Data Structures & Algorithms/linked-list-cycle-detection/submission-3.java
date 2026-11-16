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
    public boolean hasCycle(ListNode head) {
        ListNode fastHead = head;
        while(head.next != null && fastHead.next.next != null) {
            head = head.next;
            fastHead = fastHead.next.next;
            if(head == fastHead) {
                return true;
            }
        }
        return false;

    }
}
