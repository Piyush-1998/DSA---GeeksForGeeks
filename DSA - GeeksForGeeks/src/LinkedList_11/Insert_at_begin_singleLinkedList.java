package LinkedList_11;



public class Insert_at_begin_singleLinkedList {
	
	static class Node {
	int data;
	Node next;
	Node(int x) {
		data = x;
		next = null;
	}
	
}

	static Node insertBegin(Node head, int x) {
		Node temp = new Node(x);
		temp.next = head;
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = null;
		head = insertBegin(head,30);
		head = insertBegin(head,20);
		head = insertBegin(head,10);
		printlist(head);
	}
	static void printlist(Node head) {
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}
}
