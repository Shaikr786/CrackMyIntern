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
    public int getDecimalValue(ListNode head) {
          int decimalValue = 0;
        
        while (head != null) {
            // Shift the current decimal value to the left by 1 (equivalent to multiplying by 2)
            decimalValue = (decimalValue << 1) | head.val;
            // Move to the next node in the list
            head = head.next;
        }
        
        return decimalValue;
    }
}