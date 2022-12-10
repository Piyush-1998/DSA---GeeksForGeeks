package LinkedList_11;

public class Simple_circularLinkedList {
	static class Node {
		int data;
		Node prev;
		Node next;
		Node(int x) {
			data = x;
			prev = null;
			next= null;
		}
	}
		
	static void printlist(Node head) {
		if(head==null) return;
		Node t = head;
		System.out.print(head.data+" ");
		for(Node n = head.next; n!=head; n = n.next ) {
			System.out.print(n.data+" ");
		}
		System.out.println();
		do {
			System.out.print(t.data+" ");
			t = t.next;
		} while(t!=head);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		Node temp3 = new Node(40);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = head;
		temp1.prev = head;
		temp2.prev = temp1;
		temp3.prev = temp2;
		printlist(head);
		
	}

}
