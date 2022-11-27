package LinkedList_11;

import LinkedList_11.insert_at_begin_circularLinkedList.Node;

public class delete_head_circularLinkedList {
	
	static class Node {
		int data;
		Node next;
		Node(int x) {
			data = x;
			next = null;
		}
	}
	
	static Node deleteHead(Node head) {
		if(head==null) return null;
		if(head.next==null) return null;
		else {
			Node curr = head;
			while(curr.next!=head) {
				curr = curr.next;
			}
			curr.next = head.next;
			return curr.next;
		}
	}

	static Node deleteHead1(Node head) {
		if(head==null) return null;
		if(head.next==head) return null;
		else {
			head.data= head.next.data;
			head.next = head.next.next;
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
		Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	head.next.next.next=new Node(40);
    	head.next.next.next.next=new Node(50);
    	head.next.next.next.next.next=head;
		head = deleteHead(head);
		head = deleteHead1(head);
		printList(head);
	}

}
