package com.interview.que;
public class DeleteLoop {
 
      static Node1 head;
 
    public static void main(String[] args) {
        DeleteLoop l1 = new DeleteLoop();
        l1.head = new Node1(1);
        l1.head.next = new Node1(12);
        l1.head.next.next = new Node1(1);
        l1.head.next.next.next = new Node1(4);
        l1.head.next.next.next.next = new Node1(1);
 
        System.out.println("Linked List before deleting ");
        l1.print(head);
        l1.deleteNode(l1.head.next.next);
        System.out.println("");
        System.out.println("Linked List After deleting ");
        l1.print(head);
    }
 
	public void print(Node1 n) {
		
		while(n != null)
		{
			System.out.print(" " + n.data);
			n = n.next;
		}
	}

	private void deleteNode(Node1 ndelete) {
		Node1 temp = ndelete.next;
		ndelete.data = temp.data;
		ndelete.next = temp.next;
		temp = null;
	}
 
}
 class Node1 {
	 
    int data;
    Node1 next;

    Node1(int d) {
        data = d;
        next = null;
    }
}