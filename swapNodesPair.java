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
   // Base case: empty list or single node
        if (head == null || head.next == null) {
            return head;
        }
        
        // Swap the first two nodes
        ListNode first = head;
        ListNode second = head.next;
        
        // Swap the rest of the list using recursion
        first.next = swapPairs(second.next);
        second.next = first;

        // Return the new head of the swapped pairs
        return second;
    }  
}