package LinkedList_11;

import java.util.HashSet;

public class detect_loop_LinkedLIst {
	
	static class Node {
		int data;
		Node next;
		Node(int x) {
			data = x;
			next = null;
		}
	}
	//Method changing references & Pointers
	static boolean detectloop(Node head) {
		Node temp = new Node(0);
		Node curr = head;
		while(curr!=null) {
			if(head==null) return false;
			if(head.next==temp) return true;
			Node curr_next = curr.next;
			curr.next = temp;
			curr = curr.next;
		}
		return false;
	}

	//Method of Hashing
	static boolean detectLoopHashing(Node head) {
		HashSet<Node> hs = new HashSet<Node>();
		for(Node curr=head; curr!=null; curr =curr.next) {
			if(hs.contains(curr)) {
				return true;
			}
			hs.add(curr);
		}
		return false;
	}
	
	public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
        }
        System.out.println();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node(15);
    	head.next=new Node(10);
    	head.next.next=new Node(12);
    	head.next.next.next=new Node(20);
    	head.next.next.next.next=head.next;
//    	if (detectloop(head)) 
//            System.out.print("Loop found"); 
//        else
//            System.out.print("No Loop"); 
    	
    	if (detectLoopHashing(head)) 
            System.out.print("Loop found"); 
        else
            System.out.print("No Loop"); 
	}

}
