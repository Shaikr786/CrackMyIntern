public class Solution {
	public static Node addOne(Node head) {
		// Write your code here.

		int carry = helperFunc(head);

		if(carry == 1)
		{
			Node newNode = new Node(1);
			newNode.next = head;
			return newNode;
		}
		return head;
	}

	private static int helperFunc(Node head)
	{
		if(head == null)
		{
			return 1;
		}
		Node temp = head;
		int carry = helperFunc(head.next);

		head.data = head.data + carry;

		if(head.data < 10)
		{
			return 0;
		}
		head.data = 0;
			return 1;
		
	}
}