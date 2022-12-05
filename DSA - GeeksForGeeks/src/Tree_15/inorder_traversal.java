package Tree_15;

public class inorder_traversal {
	
	//Time Complexity: O(n)
	//Space Complexity: O(h) h-> height of tree
	
	static class Node {
		int data;
		Node left;
		Node right;
		Node(int x) {
			data=x;
			left =null;
			right = null;
		}
	}
	
	static void inordertraversal (Node root) {
		if(root!=null) {
			inordertraversal(root.left);
			System.out.print(root.data+" ");
			inordertraversal(root.right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		inordertraversal(root);
	}

}
