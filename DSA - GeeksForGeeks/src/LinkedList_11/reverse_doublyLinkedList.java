package LinkedList_11;

public class reverse_doublyLinkedList {
	
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
	
	static Node reverse(Node head) {
		if(head == null || head.next==null) {
			return head;
		}
		Node prev = null;
		Node curr = head;
		while(curr!=null) {
			prev = curr.prev;
			curr.prev = curr.next;
			curr.next = prev;
			curr = curr.prev;
		}
		return prev.prev;
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
		temp1.prev = head;
		temp2.prev = temp1;
		printlist(head);
		head = reverse(head);
		printlist(head);
		
	}

}
