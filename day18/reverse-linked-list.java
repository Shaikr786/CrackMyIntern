class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode next = curr.next; // Store the next node
            curr.next = prev;          // Reverse the current node's pointer
            prev = curr;               // Move prev and curr one step forward
            curr = next;
        }
        
        return prev; // prev will be the new head of the reversed list

    }
}