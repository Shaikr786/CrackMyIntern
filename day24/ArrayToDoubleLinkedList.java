class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        Node head = new Node(arr[0]);
        
        Node back = head;
        
        for(int i = 1 ; i < arr.length ; i++)
        {
            Node temp = new Node(arr[i]);
            
            back.next = temp;
            
            temp.prev = back;
            
            back = temp;
        }
        return head;
    }
}


