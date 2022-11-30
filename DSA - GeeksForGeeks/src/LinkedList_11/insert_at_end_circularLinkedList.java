package LinkedList_11;

import LinkedList_11.Insert_at_begin_singleLinkedList.Node;

public class insert_at_end_circularLinkedList {

	static class Node {
		int data;
		Node next;
		Node(int x) {
			data= x;
			next = null;
		}
	}
	//naive approach
	static Node insertEnd(Node head, int x) {
		Node temp = new Node(x);
		if(head == null) {
			temp.next = temp;
			return temp;
		}
		else {
			Node curr = head;
			while(curr.next!=head) {
				curr = curr.next;
			}
			curr.next = temp;
			temp.next = head;
			return head;
		}
	}
	//Efficient approach
	static Node insertEnd1(Node head, int x) {
		Node temp = new Node(x);
		if(head == null) {
			temp.next = temp;
			return temp;
		}
		else {
			temp.next = head.next;
			head.next = temp;
			int t = head.data;
			head.data = temp.data;
			temp.data = t;
			return temp;
		}
	}
	
	static void printlist(Node head) {
		if(head==null) return;
		System.out.print(head.data+" ");
		for(Node n = head.next; n!=head; n = n.next) {
			System.out.print(n.data+" ");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	head.next.next.next=head;
		head = insertEnd(head,5);
		head = insertEnd1(head,15);
		printlist(head);
	}

}
