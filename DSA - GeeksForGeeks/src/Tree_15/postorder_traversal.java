package Tree_15;

public class postorder_traversal {
	
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
	
	static void postorder(Node head) {
		
		if(head!=null) {
			
			postorder(head.left);
			postorder(head.right);
			System.out.print(head.data+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.left = new Node(20);
		head.right = new Node(30);
		head.right.left = new Node(40);
		head.right.right = new Node(50);
		postorder(head);
	}

}
