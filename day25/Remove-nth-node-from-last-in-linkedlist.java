
public class Solution
{
    public static Node removeKthNode(Node head, int K)
    {
        // Write your code here.
        Node fast = head;
        Node slow = head;

        for(int i = 0 ; i < K ; i++)
        {
            fast = fast.next;
        }
        //if equals to length of the list
        if(fast == null)
        {
            return head.next;
        }
        while(fast.next != null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        
        Node deleteNode = slow.next;

        slow.next = slow.next.next;

        return head;
    }
}