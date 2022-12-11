package BinarySearchTree_16;

public class search_in_BST {
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		Node(int x) {
			data=x;
			left = null;
			right= null;
		}
	}
	// Recursive approach
	static boolean search(Node root, int x) {
		if(root==null) return false;
		else if(root.data==x) return true;
		else if(x>root.data) {
			return search(root.right,x);
		}
		else return search(root.left,x);
	}
	
	//Iterative approach
	static boolean search1(Node root, int x) {
		while(root!=null) {
			if(root.data==x) return true;
			else if(x>root.data) root = root.right;
			else root =root.left;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(15);
    	root.left=new Node(5);
    	root.left.left=new Node(3);
    	root.right=new Node(20);
    	root.right.left=new Node(18);
    	root.right.left.left=new Node(16);
    	root.right.right=new Node(80);
    	int x = 200;
    	
    	if(search(root,x)) System.out.println("Recursion - Found");
    	else System.out.println("Recusrion - Not Found");
    	
    	if(search1(root,x)) System.out.println("Iterative - Found");
    	else System.out.println("Iterative - Not Found");
	}

}
