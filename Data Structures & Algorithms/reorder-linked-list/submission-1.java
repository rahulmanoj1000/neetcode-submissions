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
        //Find the midpoint of the linked list
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondStart = slow.next;
        slow.next = null;

        //Reverse the latter linked list
        ListNode prev = null;
        while(secondStart != null) {
            ListNode nxt = secondStart.next;
            secondStart.next = prev;
            prev = secondStart;
            secondStart = nxt;
        }
        //Join the linked list in the required order
        ListNode headTwo = prev;
        ListNode headOne = head;
        while(headTwo != null) {
            ListNode headOneNext = headOne.next;
            headOne.next = headTwo;
            ListNode headTwoNext = headTwo.next;
            headTwo.next = headOneNext;
            headOne = headOneNext;
            headTwo = headTwoNext;
        }

    }
}
