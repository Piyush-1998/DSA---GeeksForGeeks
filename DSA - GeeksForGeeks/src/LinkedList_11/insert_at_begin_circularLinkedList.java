package LinkedList_11;

import LinkedList_11.Simple_circularLinkedList.Node;

public class insert_at_begin_circularLinkedList {

	static class Node {
		int data;
		Node prev;
		Node next;
		Node(int x) {
			data =x;
			prev = null;
			next = null;
		}
	}
	//Naive approach
	static Node insertBegin(Node head, int x) {
		Node temp = new Node(x);
		
		if(head==null) {
			temp.next = temp;
			return temp;
		}
		else {
			Node curr = head;
			while(curr.next!=head ) {
				curr = curr.next;
			}
			curr.next = temp;
			temp.next = head;
		}

		return temp;
	}
	
	//Optimised approach
	static Node insertbegin1(Node head, int x) {
		Node temp = new Node(x);
		if(head == null ) {
			temp.next = temp;
			return temp;
		}
		else {
			temp.next = head.next;
			head.next = temp;
			int z = head.data;
			head.data= temp.data;
			temp.data = z;
			return head;
		}
		
	}
	
	static void printList(Node head) {
		if(head==null) return;
		System.out.print(head.data+" ");
		for(Node n = head.next; n!=head; n = n.next ) {
			System.out.print(n.data+" ");
		}
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
		head = insertBegin(head,5);
		head = insertbegin1(head,15);
		printList(head);
	}

}
