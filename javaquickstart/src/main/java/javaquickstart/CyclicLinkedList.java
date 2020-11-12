package javaquickstart;

import java.util.HashMap;
import java.util.Map;

public class CyclicLinkedList {
	
	static class Node {
		int data;
		Node next;
		
		Node(int d) {
			this.data = d;
			this.next = null;
		}
		
		public static void main(String args[]) {
			CyclicLinkedList cll = new CyclicLinkedList();
			Node n1 = new Node(10);
			Node n2 = new Node(20);
			Node n3 = new Node(30);
			Node n4 = new Node(40);
			Node n5 = new Node(10);
			n1.next = n2;
			n2.next = n3;
			n3.next = n4;
			n4.next = n5;
			
			Map<String, Integer> map = new HashMap<String, Integer> ();
			Node temp = n1; 
			while (temp !=null) {
				if(map.containsKey(String.valueOf(temp.data))) {
					System.out.print("The linked list is cyclic");
				} else {
					map.put(String.valueOf(temp.data), 1);
				}
				temp = temp.next;
			}
		}
	}

}
