package Tree_15;

import Tree_15.postorder_traversal.Node;

public class preorder_traversal {
	
	static class Node {
		int data;
		Node left;
		Node right;
		Node(int x) {
			data = x;
			left = null;
			right = null;
		}
	}
	
static void preorder(Node head) {
		
		if(head!=null) {
			System.out.print(head.data+" ");
			preorder(head.left);
			preorder(head.right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.left = new Node(20);
		head.right = new Node(30);
		head.right.left = new Node(40);
		head.right.right = new Node(50);
		preorder(head);

	}

}
