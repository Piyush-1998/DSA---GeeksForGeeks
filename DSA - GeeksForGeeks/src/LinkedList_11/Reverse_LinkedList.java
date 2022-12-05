package LinkedList_11;
import java.util.ArrayList;

public class Reverse_LinkedList {
	
	static class Node {
		int data;
		Node next;
		Node(int x) {
			data= x;
			next = null;
		}
	}
	//Naive approach(Iterative)
	static Node reverse(Node head) {
		if(head == null) return null;
		ArrayList<Integer> al = new ArrayList();
		for(Node curr = head; curr != null; curr = curr.next) {
			al.add(curr.data);
		}
		for(Node curr = head; curr != null; curr = curr.next) {
			curr.data = al.remove(al.size()-1);
		}
		return head;
	}
	
	//Efficient approach(Iterative)
	static Node reverse1(Node head) {
		Node curr = head;
		Node prev = null;
		while(curr!=null) {
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}
	
	//Recursion Method
	static Node reverseRecursion(Node head) {
		if(head==null || head.next==null) return head;
		Node rest_head = reverseRecursion(head.next);
		Node rest_tail = head.next;
		rest_tail.next = head;
		head.next = null;
		return rest_head;
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
		printlist(head);
		head = reverse(head);
		printlist(head);
		head = reverse1(head);
		printlist(head);
		head = reverseRecursion(head);
		printlist(head);

	}

}
