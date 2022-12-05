package Tree_15;

import Tree_15.level_order_traversal.Node;

public class maximum_binary_tree {
	
	static class Node {
		int data;
		Node left;
		Node right;
		Node(int x) {
			data=x;
			left = null;
			right= null;
		}
	}
	
	static int max(Node root) {
		if(root==null) return Integer.MIN_VALUE;
		else {
			return Math.max(root.data, Math.max(max(root.left), max(root.right)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.left.left=new Node(40);
    	root.left.right=new Node(5000);
    	root.right.left=new Node(60);
    	root.right.right=new Node(10);
    	System.out.print(max(root));

	}

}
