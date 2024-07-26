/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // Edge case: If the list is empty or has only one node, it cannot have a cycle
        if (head == null || head.next == null) {
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move slow pointer by one step
            fast = fast.next.next;     // Move fast pointer by two steps
            
            if (slow == fast) {
                return true;           // Cycle detected
            }
        }
        
        return false;                  // No cycle detected
    }
}
