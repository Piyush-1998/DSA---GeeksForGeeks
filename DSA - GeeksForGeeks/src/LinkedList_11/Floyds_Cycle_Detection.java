package LinkedList_11;

public class Floyds_Cycle_Detection {
	
	static class Node {
		int data;
		Node next;
		Node(int x) {
			data = x;
			next = null;
		}
	}
	
	static boolean floydscycledetection(Node head) {
//		Node curr = head;
		Node slow_p = head;
		Node fast_p = head;
		while(fast_p!=null && fast_p.next!=null) {
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;
			if(slow_p==fast_p) return true;
		}
		
		return false;
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
		head.next.next.next.next = head.next;
		if(floydscycledetection(head)) System.out.println("Loop Found");
		else System.out.println("Loop Not Found");
	}

}
