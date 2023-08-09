package Stack2Assignment;


class Node {
	public int val;
	public Node next;
	public Node(int val)
	{
		this.val = val;
		next = null;
	}
}

public class Question2 {
	public static Node insert(Node head,int val)
	{
		if(head==null) {
			return new Node(val);
		}
		Node tail = head;
		while(tail.next != null) {
			tail =tail.next;
		}
		tail.next = new Node(val);
		return head;
		
	}
	
}