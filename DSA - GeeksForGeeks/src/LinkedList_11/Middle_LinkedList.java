package LinkedList_11;

public class Middle_LinkedList {
	
	static class Node {
		int data;
		Node next;
		Node(int x) {
			data =x;
			next = null;
		}
	}
	
	//Naive approach
	static void middleElement(Node head) {
		if(head==null) return;
//		if(head.next==null) return head.data;
		int count = 0;
		Node curr = head;
		while(curr!=null) {
			count++;
			curr = curr.next;
		}
		curr = head;
		for(int i =0; i<count/2; i++ ) {
			curr = curr.next;
		}
		System.out.print(curr.data);
//		return count;
		System.out.println();
	}

	
	
	//Efficient approach
	static void middleElement1(Node head) {
		if(head==null) return;
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.data+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
//		head.next.next.next = new Node(40);
		middleElement(head);
		middleElement1(head);
	}

}
