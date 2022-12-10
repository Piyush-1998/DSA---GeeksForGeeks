package LinkedList_11;

public class search_an_element_singleLinkedList {
	
	static class Node {
		int data;
		Node next;
		Node(int x) {
			data=x;
			next = null;
		}
	}
	//Below is iterative approach
//	static int searchelement(Node head, int x) {
//		int pos = 1;
//		Node curr = head;
//		while(curr!=null) {
//			if(curr.data==x) {
//				return pos;
//			}
//			else {
//				pos++;
//				curr = curr.next;
//			}
//		}
//		return -1;
//	}
	
	//Below is recursive approach
	static int searchelementrecursive(Node head, int x) {
		if(head==null)	return -1;
		if(head.data==x)	return 1;
		else {
			int res = searchelementrecursive(head.next,x);
			if(res==-1) return -1;
			else return (res+1);
		}
	}
	
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
//		System.out.print(searchelement(head,70));
		System.out.print(searchelementrecursive(head,30));
	}

}
