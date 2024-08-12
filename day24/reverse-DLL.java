public static Node reverseDLL(Node  head)
{

    if (head == null || head.next == null) {
            return head; // No need to reverse if the list is empty or has one node
        }
        
        Stack<Node> st = new Stack<>();
        
        Node temp = head;
        
        // Push all nodes onto the stack
        while (temp != null) {
            st.push(temp);
            temp = temp.next;
        }
        
        // Pop nodes off the stack and update links
        head = st.pop(); // The last node in the original list becomes the new head
        temp = head;
        Node prev = null;
        
        while (!st.isEmpty()) {
            Node current = st.pop();
            temp.next = current;
            current.prev = temp;
            prev = temp;
            temp = current;
        }
        
        // Final adjustments
        temp.next = null; // The last node in the reversed list should point to null
        return head;
    }
}//time limit exceeded.


//optimised code is


public static Node reverseDLL(Node  head)
{
    //Your code here
    
    if(head == null || head.next == null)
    {
        return head;
    }
    
    Node temp = null;
    
    Node current = head;
    
    while(current != null)
    {
        temp = current.prev;
        
        current.prev = current.next;
        
        current.next = temp;
        
        current = current.prev;
    }
    if (temp != null) {
        head = temp.prev;
    }
    
    return head;
    
}