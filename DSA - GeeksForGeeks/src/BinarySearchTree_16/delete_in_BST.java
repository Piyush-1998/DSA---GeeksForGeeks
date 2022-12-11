package BinarySearchTree_16;

public class delete_in_BST {
	
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
	
	static Node delete(Node root, int x) {
		if(root == null) return null;
		if(x>root.data) {
			root.right = delete(root.right,x);
		}
		else if(x<root.data) {
			root.left = delete(root.left, x);
		}
		else {
			if(root.left==null) return root.right;
			else if(root.right==null) return root.left;
			else {
				Node succ = getsucc(root);
				root.data=succ.data;
				root.right = delete(root.right,succ.data);
			}
			
		}
		return root;
	}
	
	static Node getsucc(Node curr) {
		curr = curr.right;
		while(curr!=null && curr.left!=null) {
			curr = curr.left;
		}
		return curr;
	}

	static void inorder(Node root) {
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
    	int x=15;
    	
    	root=delete(root,x);
	    inorder(root);
	}

}
