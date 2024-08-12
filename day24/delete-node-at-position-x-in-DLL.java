class Solution {
    public Node deleteNode(Node head, int x) {
        
        Node temp = head;
        
        int count = 0;
        
        while(temp != null)
        {
            count ++;
            if(count == x)
            {
                break;
            }
            temp = temp.next;
        }
        
        Node previous = temp.prev;
        Node front = temp.next;
        
        if(previous == null && front == null)
        {
            return null;
        }
        
        else if(previous == null)
        {
            head = head.next;
            return head;
        }
        
        else if(front == null)
        {
            temp = temp.prev;
            temp.next = null;
            return head;
        }
        else{
            previous.next = front;
            front.prev = previous;
            return head;
        }
        
        
    }
}



//



public class Solution
{
    public static Node deleteLastNode(Node head) {
        // Write your code here
        if(head == null || head.next == null)
        {
            return null;
        }
        Node temp = head;

        while(temp.next != null)
        {
            temp = temp.next;
        }
        Node newTail = temp.prev;

       newTail.next = null;
       temp.prev = null;
        return head;
    }
}

//


public class Solution {
    public static Node deleteHead(Node head) {
        // Write Your Code Here.
        head = head.next;
        return head;
    }
}