package LinkedList_11;

public class delete_at_end {
	
	static class Node {
		int data;
		Node next;
		Node(int x) {
			data = x;
			next = null;
		}
	}
	
	static Node delNode(Node head) {
		if(head == null) {
			return null;
		}
		if(head.next == null) {
			return null;
		}
		Node curr = head;
		while(curr.next.next != null) {
			curr = curr.next;
		}
		curr.next = null;
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
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		printlist(head);
		head = delNode(head);
		printlist(head);
	}

}
