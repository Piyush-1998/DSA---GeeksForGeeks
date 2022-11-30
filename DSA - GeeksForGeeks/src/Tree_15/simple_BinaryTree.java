package Tree_15;

public class simple_BinaryTree {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left  = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
	}

}
