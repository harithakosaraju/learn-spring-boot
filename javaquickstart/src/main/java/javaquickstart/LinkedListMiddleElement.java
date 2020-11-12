package javaquickstart;

public class LinkedListMiddleElement {
	Node head;
	
	public static void main(String args[]) {
		LinkedListMiddleElement ll = new LinkedListMiddleElement();
		
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		ll.head =n1;
		findMiddle(ll.head);
	}
	
	static class Node {
		int data;
		Node next;
		
		Node(int d) {
			this.data = d;
		}
	}
	
	static void findMiddle(Node head) {
		Node middle = head;
		Node current = head;
		int length = 0;
		while(current != null) {
			length++;
			if(length%2 == 0) {
				middle = middle.next;
			}
			current = current.next;
		}
		
		System.out.println("length of LinkedList: " + length);
	    System.out.println("middle element of LinkedList : " + middle.data);	
	}

}
