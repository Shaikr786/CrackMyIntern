public class Solution
{
    public static Node reverseLinkedList(Node head)
    {
        // Write your code here.
        Node temp = head;
        Node prev = null;
        while(temp != null)
        {
            Node front = temp.next;
            temp.next = prev;
            prev = temp; //previous to temp 
            temp = front; // temp moves to front
        }
        return prev;//finally the pointer stays at the last node that is head after reversing so return it
    }
}


//Recursive approach 

public class Solution
{
    public static Node reverseLinkedList(Node head)
    {
        // Write your code here.
        if(head == null || head.next == null)
        {
            return head;
        }
        Node newHead = reverseLinkedList(head.next);

        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
}