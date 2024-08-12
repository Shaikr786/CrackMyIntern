public class Solution {
    public static boolean isPalindrome(Node head) {
        // write your code here
          if(head == null || head.next == null)
        {
            return true;
        }
        Stack<Integer> stack = new Stack<>();

        Node temp = head;

        while(temp != null)
        {
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;

        while(temp != null)
        {
            int el = stack.pop();
            if(el != temp.data)
            {
                return false;
            }
            temp = temp.next;
        }
        return true;
      
    }
}


//optimised code 

public class Solution {
    public static boolean isPalindrome(Node head) {
        // write your code here

        if(head == null || head.next == null)
        {
            return true;
        }
        Node fast = head;
        Node slow = head;

        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node newHead = reverse(slow.next);
        Node first = head;
        Node second = newHead;

        while(second != null)
        {
            if(first.data != second.data)
            {
                reverse(newHead);
                return false;
            }

            first = first.next;
            second = second.next;

        }
        reverse(newHead);
        return true;
    }

    private static Node reverse(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node newHead = reverse(head.next);

        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;

    }
}