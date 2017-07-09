package com.interview.que;
//
public class LinkedLoop {
	static Node head;

	public static void main(String[] args) {
		LinkedLoop l1 = new LinkedLoop();
        l1.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        
        l1.head.next = second;
        second.next = third;
        third.next = head.next;
       System.out.print("result" +  checkloop(head));
    
	}


	private static String checkloop(Node node) {
		// TODO Auto-generated method stub
		String n = "visited";
		String n1 = "not visited";
		if(head == null)
		{
			head = node;
		}
		Node visit=head, nvisit = head;
		 while (nvisit != null && nvisit.next != null) {
			   nvisit = nvisit.next.next;
			   visit = visit.next;
			   if (visit == nvisit)
			    return n;
			  }
		return n1;
	}

	

}

class Node {
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
