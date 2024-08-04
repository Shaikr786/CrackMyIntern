
class Solution
{
    Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    Node compute(Node head) {
        // Step 1: Reverse the linked list
        head = reverse(head);

        // Step 2: Traverse the reversed list and remove nodes with smaller values
        Node maxNode = head;
        Node curr = head;

        while (curr != null && curr.next != null) {
            if (curr.next.data < maxNode.data) {
                curr.next = curr.next.next; // Remove the node
            } else {
                curr = curr.next;
                maxNode = curr; // Update the maxNode
            }
        }

        // Step 3: Reverse the list again to restore the original order
        head = reverse(head);

        return head;
    }
}
  