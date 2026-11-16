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
        //Comprises of three steps(Two pointer technique)

        //1) Create a dummy pointer that starts from null this will be nodeOne
        //Node one will connect to the next to next node to delete the node at n
        ListNode dummy = new ListNode(0, head);
        ListNode nodeOne = dummy;
        ListNode nodeTwo = head;

        //2) NodeTwo will help us find the position of the element 
        //   that needs to be deleted
        int counter = 0;
        while(counter < n) {
            nodeTwo = nodeTwo.next;
            counter++;
        }
        //3) Now move both the pointers such that when nodeTwo is null 
        //   nodeOne will be in the position to delete the required node

        while(nodeTwo != null) {
            nodeOne = nodeOne.next;
            nodeTwo = nodeTwo.next;
        }
        nodeOne.next = nodeOne.next.next;
        return dummy.next;
    }
}
