package LinkedList_11;

public class insert_begin_doubleLinkedList {
	
	static class Node {
		int data;
		Node next;
		Node prev;
		Node(int x) {
			data = x;
			next = null;
			prev = null;
		}
	}
	
	static Node insertBegin(Node head, int x) {
		Node temp = new Node(x);
		temp.next = head;
		if(head!=null) {
			head.prev = temp;
		}
		return temp;
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
		Node head = new Node(20);
		Node node1 = new Node(30);
		Node node2 = new Node(40);
		head.next = node1;
		node1.next = node2;
		node1.prev = head;
		node2.prev = node1;
		printlist(head);
		head = insertBegin(head,10);
		printlist(head);
	}

}
