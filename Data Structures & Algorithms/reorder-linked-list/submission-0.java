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
    public void reorderList(ListNode head) {
        //Step 1: Find the middle point
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondStart = slow.next;
        slow.next = null;
        //Step 2: Reverse the second half of the linked list
        ListNode prev = null;
        while(secondStart != null) {
            ListNode next = secondStart.next;
            secondStart.next = prev;
            prev = secondStart;
            secondStart = next;
        }

        //Step 3: Join the lists in the order required
        ListNode backStart = prev;
        ListNode start = head;
        while(backStart != null) {
            ListNode oNext = head.next;
            head.next = backStart;
            ListNode oBackStart = backStart.next;
            backStart.next = oNext;
            head = oNext;
            backStart = oBackStart;
        }
    }
}
