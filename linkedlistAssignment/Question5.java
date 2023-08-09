package linkedlistAssignment;

import java.util.*;

class Node4 {
    public int data;
    public Node4 next;

    public Node4(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList3 {
    public Node4 head = null, tail = null;

    public void insert(int val) {
        if (head == null) {
            head = tail = new Node4(val);
            return;
        }
        tail.next = new Node4(val);
        tail = tail.next;
    }

    public void print() {
        Node4 curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if(curr.next != null)
                System.out.print("->");
            curr = curr.next;
        }
    }
}

public class Question5 {
    public static void count(Node4 head1, Node4 head2) {
        Node4 curr = head1;
        while (curr != null) {
            int count = 0;
            Node4 second = head2;
            while (second != null) {
                if (second.data < curr.data)
                    count += 1;
                second = second.next;
            }
            System.out.print(count + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        LinkedList3 ll = new LinkedList3();
        for (int i = 0; i < n; i++) {
            ll.insert(sc.nextInt());
        }
        LinkedList3 ll2 = new LinkedList3();
        for (int i = 0; i < m; i++) {
            ll2.insert(sc.nextInt());
        }
        count(ll.head, ll2.head);
    }
}
