package LinkedList_11;
import java.util.Scanner;
public class insert_at_given_point_singleLinkedList {
	
	static class Node {
		int data;
		Node next;
		Node(int x) {
			data = x;
			next = null;
		}
	}
	
	static Node insertatgivenpoint(Node head, int pos, int data) {
		
		Node temp = new Node(data);
		if(pos == 1) {
			temp.next = head;
			return temp;
		}
		
		Node curr = head;
		for(int i = 1; i<=pos-2 && curr!=null; i++) {
			curr = curr.next;
		}
		if(curr == null) {
			return head;
		}
		temp.next = curr.next;
		curr.next = temp;
		
		return head;
	}

	static void printlist(Node head) {
		Node curr = head;
		while(curr!= null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int pos = sc.nextInt();
		int x = sc.nextInt();
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		printlist(head);
		head = insertatgivenpoint(head,pos,x);
		printlist(head);
	}

}
