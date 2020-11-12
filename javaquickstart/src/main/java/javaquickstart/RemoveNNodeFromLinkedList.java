package javaquickstart;

public class RemoveNNodeFromLinkedList {
	Node head;
	static class Node {
		int data;
		Node next;
		
		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}
	
	static void reverse (Node node, int n) {
		int len=0;
		Node temp = node;
		while(temp != null) {
			temp = temp.next;
			len++;
		}
		temp = node;
		for(int i =0; i < len - n; i++) {
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
	
	public static void main(String args[]) {
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		RemoveNNodeFromLinkedList ll = new RemoveNNodeFromLinkedList();
		ll.head = n1;
		reverse(ll.head, 2);
	}

}
