package LinkedList_11;

import java.util.HashSet;

public class DetectandRemove_Loop_LinkedList {
	
	static class Node {
		int data;
		Node next;
		Node(int x) {
			data = x;
			next = null;
		}
	}
	//Function using slow & fast Pointers
	static void detectandremove(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast) {
				break;
			}
		}
		if(slow!=fast) return;
		slow = head;
		while(slow.next!=fast.next) {
			slow= slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}
	//function without using slow & fast pointers
	static void detectandremovewithoutfastslowpointers(Node head) {
		Node temp = null;
        Node prev = null;
        while(head!=null) {
            if(head.data<0) {
                prev.next = null;
                return;
            }
            prev = head;
            head.data = -head.data;
            head = head.next;
        }
	}
    //function using Hashset   
    static void detectandremoveusingHashset(Node head) {
    	HashSet hs = new HashSet();
        Node curr = head;
        Node prev = null;
        while(curr!=null) {
            if(!(hs.contains(curr))) {
                hs.add(curr.data);
                prev = curr;
                curr = curr.next;
            } 
            else {
                break;
                }
            }
            if(curr.next==null) return;
            else {
                prev.next = null;
                return;
            }
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
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = head.next;
//		printlist(head);
		detectandremove(head);
		printlist(head);
	}

}
