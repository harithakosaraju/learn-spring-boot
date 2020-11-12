package javaquickstart;

public class ReverseLinkedList {
	  Node head;
	
	public static void main(String args[]) {
		ReverseLinkedList ll = new ReverseLinkedList();
		
		Node n1 = new Node(10);
		Node n2 = new Node(22);
		Node n3 = new Node(34);
		Node n4 = new Node(56);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		ll.head = n1;
		System.out.println();
		print(ll.head);
		print(reverse(ll.head));
		
	}
	
	static class Node {
		int data;
		Node next;
		
		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}
	
	static void print(Node n) {
		while(n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	
	static Node reverse(Node node) {
		Node next = null;
		Node prev = null;
		Node current = node;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	} 

}
