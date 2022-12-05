package Tree_15;

public class printNodesatDistanceK {
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
	
	static void printdistK(Node root, int K) {
		if(root==null) return;
		if(K==0) System.out.print(root.data+" ");
		else {
			printdistK(root.left,K-1);
			printdistK(root.right,K-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int K = 2;
		Node head = new Node(10);
		head.left = new Node(20);
		head.right = new Node(30);
		head.left.left = new Node(40);
		head.left.right = new Node(50);
		head.right.right = new Node(60);
		head.right.right.right = new Node(70);
		printdistK(head,K);
		
	}

}
