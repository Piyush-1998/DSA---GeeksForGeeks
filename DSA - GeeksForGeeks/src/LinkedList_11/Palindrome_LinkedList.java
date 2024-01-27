package LinkedList_11;

import java.util.ArrayDeque;
import java.util.Deque;

import LinkedList_11.Reverse_LinkedList.Node;

public class Palindrome_LinkedList {
	
	static class Node {
		char data;
		Node next;
		Node(char x) {
			data= x;
			next = null;
		}
	}
	//Naive Solution TC: O(n) SC: O(n)
	static boolean Palindrome(Node head) {
		Deque<Character> stack = new ArrayDeque<Character>();
		for(Node curr = head; curr!=null; curr = curr.next) {
			stack.push(curr.data);	
		}
		for(Node curr = head; curr!=null; curr = curr.next) {
			if(stack.pop()!=curr.data) return false;
		}
		return true;
	}

	//Efficient approach
	static boolean Palindrome1(Node head) {
		//Below to find middle node
		if(head==null) return true;
		Node slow = head;
		Node fast = head;
		while(fast.next!=null && fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		//Below func is to reverse from middle node to last node
		Node rev = reverse(slow.next);
		//Below code is to compare front and last node for palindrome
		Node curr = head;
		while(rev!=null) {
			if(rev.data!=curr.data) {
				return false;
			}
			
			rev = rev.next;
			curr = curr.next;
		}
		return true;
	}
	
	static Node reverse(Node head) {
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node('g');
		head.next = new Node('f');
		head.next.next = new Node('g');
		if(Palindrome1(head)) System.out.print("LinkedList is a Palindrome");
		else System.out.print("LinkedList is not a Palindrome");
	}

}
