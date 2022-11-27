package LinkedList_11;

public class delete_head_doublyLinkedList {
	
	static class Node {
		int data;
		Node prev;
		Node next;
		Node(int x) {
			data = x;
			prev = null;
			next = null;
		}
		
	}
	
	static Node deleteHead(Node head) {
		if(head == null) return null;
		if(head.next == null) return null;
		else {
			head = head.next;
			head.prev = null;
		}
		return head;
	}
	
	static void printlist(Node head) {
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.next = temp2;
		temp2.prev = temp1;
		temp1.prev = head;
		printlist(head);
		head = deleteHead(head);
		printlist(head);
	}

}
