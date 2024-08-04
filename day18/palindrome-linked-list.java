class Solution {
      public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; // A list with 0 or 1 nodes is a palindrome
        }
        
        // Step 1: Find the middle of the linked list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Step 2: Reverse the second half of the list
        ListNode secondHalfStart = reverseList(slow);
        ListNode firstHalfStart = head;
        
        // Step 3: Compare the first half and the reversed second half
        ListNode p1 = firstHalfStart;
        ListNode p2 = secondHalfStart;
        boolean palindrome = true;
        while (palindrome && p2 != null) {
            if (p1.val != p2.val) {
                palindrome = false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        
        // Step 4: Restore the list (optional)
        reverseList(secondHalfStart); // Optional: restore the list
        
        // Step 5: Return the result
        return palindrome;
    }
    
    // Helper method to reverse a linked list
    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev; // New head of the reversed list
    }

    // Helper method to print the linked list (for testing)
    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

}