package LinkedList_11;

public class delete_kthnode_circularLinkedList {
	
	static class Node {
		int data;
		Node next;
		Node(int x) {
			data = x;
			next = null;
		}
	}

	static Node deleteKthnode(Node head, int x) {
		if(head==null) return null;
		if(x==1) {
			head.data=head.next.data;
			head.next = head.next.next;
			return head;
		}
		Node curr = head;
		for(int i =0; i<x-2; i++) {
			curr = curr.next;
		}
		curr.next = curr.next.next;
		return head;
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
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = head;
		head = deleteKthnode(head,1);
		printlist(head);
		
	}

}
