package LinkedList_11;



public class insert_at_end_singleLinkedList {
	
//	static class for Node
	
	static class Node {
		int data;
		Node next;
		Node(int x) {
			data = x;
			next = null;
		}
	}
	
//Function for insertion at the end
	
	static Node insertatend(Node head, int x) {
		Node temp = new Node(x);
		if(head==null) {
			return temp;
		}
		Node curr = head;
		while(curr.next!=null) {
			curr = curr.next;
		}
		curr.next = temp;
		return head;
	}
	
//Function for printing the list	
	
	static void printlist(Node head) {
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = null;
		head = insertatend(head,30);
		head = insertatend(head,20);
		head = insertatend(head,10);
		printlist(head);
	}

}
