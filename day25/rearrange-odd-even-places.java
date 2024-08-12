public class Solution {
    public static Node oddEvenList(Node head) {
        // Write your code here.
        if (head == null) {
            return null;
        }

        int n = 0;
        Node temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        int[] arr = new int[n];
        temp = head;
         int index = 0;
        while (temp != null) {
           arr[index++] = temp.data;
            if (temp.next != null) {
                temp = temp.next.next;
            } else {
                break;
            }
        }

        temp = head.next;
        while (temp != null) {
            arr[index++] = temp.data;
            if (temp.next != null) {
                temp = temp.next.next;
            } else {
                break;
            }
        }

        temp = head;
        index = 0;
        while (temp != null) {
            temp.data = arr[index++];
            temp = temp.next;
            
        }
        return head;
    }
}


//optimal solution for reducing space complexity from O(n) to O(1).

