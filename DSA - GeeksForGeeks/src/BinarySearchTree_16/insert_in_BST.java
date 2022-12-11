package BinarySearchTree_16;

import BinarySearchTree_16.search_in_BST.Node;

public class insert_in_BST {
	
	static class Node {
		int data;
		Node left;
		Node right;
		Node(int x) {
			data=x;
			left = null;
			right = null;
		}
	}
	//Recursive approach
	static Node insert(Node root, int x) {
		if(root==null) return new Node(x);
		if(x>root.data) root.right = insert(root.right,x);
		else if (x<root.data) {
			root.left = insert(root.left,x);
		}
		return root;
	}
	
	//Iterative approach
	static Node insert1(Node root, int x) {
		Node temp = new Node(x);
		Node parent = null;
		Node curr = root;
		while(curr!=null) {
			parent = curr;
			if(x>curr.data) {
				curr = curr.right;
			}
			else if(x<curr.data) {
				curr = curr.left;
			}
			else return root;
		}
		if(parent==null) return temp;
		if(x>parent.data) parent.right = temp;
		else parent.left = temp;
		return root;
	}
	
	public static void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(10);
    	root.left=new Node(5);
    	root.right=new Node(15);
    	root.right.left=new Node(12);
    	root.right.right=new Node(18);
    	
    	int x1 = 100;
    	int x2 = 11;
    	root = insert(root,x1);
    	root = insert1(root,x2);
    	inorder(root);
    	
	}

}
