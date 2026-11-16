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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) {
            return head.next;
        }
        int len = 0;
        ListNode dummy = head;
        while(dummy != null) {
            len++;
            dummy = dummy.next;
        }

        int valToRemove = len - n;

        if (valToRemove == 0) {
            return head.next;
        }

        ListNode dummy2 = head;
        int count = 0;

        while (dummy2 != null) {
            if (count == valToRemove - 1) {
                dummy2.next = dummy2.next.next;
                break;
            }
            dummy2 = dummy2.next;
            count++;
        }

        return head;

    }
}
