package linkedlistAssignment;
import java.util.*;

class Node2 {
    public int data;
    public Node2 next;

    public Node2(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList2 {
    public Node2 head = null, tail = null;

    public void insert(int val) {
        if (head == null) {
            head = tail = new Node2(val);
            return;
        }
        tail.next = new Node2(val);
        tail = tail.next;
    }

    public void print() {
        Node2 curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if(curr.next != null)
                System.out.print("->");
            curr = curr.next;
        }
    }
}

public class Question4 {
    public static Node2 update(Node2 head) {
        int count = 0 ;
        Node2 prev = null,curr = head;
        while(curr != null) {
        	if(curr != null) {
        		if(curr.data == 1) {
        			if(count % 2 == 1) {
        				prev.next = new Node2(0);
        				prev = prev.next;
        				prev.next = curr;
        			}
        			count = 0;
        		}
        		else {
        			count++;
        		}
        		prev = curr;
        		curr = curr.next;
        	}
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList2 l2 = new LinkedList2();
        for (int i = 0; i < n; i++) {
            l2.insert(sc.nextInt());
        }
        l2.head = update(l2.head);
        l2.print();
    }
}


