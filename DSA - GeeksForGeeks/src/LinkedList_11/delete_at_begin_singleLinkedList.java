package LinkedList_11;

import LinkedList_11.Insert_at_begin_singleLinkedList.Node;

public class delete_at_begin_singleLinkedList {
	
	static class Node {
		int data;
		Node next;
		Node(int x) {
			data = x;
			next = null;
		}
	}

	static Node deleteNode(Node head) {
		if(head==null) {
			return null;
		}
		else {
			return head.next;
		}
	}
	
	static void printlist(Node head) {
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr =curr.next;
		}
		System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next= new Node(40);
		printlist(head);
		head = deleteNode(head);
		printlist(head);
	}

}
