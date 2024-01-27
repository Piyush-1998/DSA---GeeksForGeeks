package Tree_15;

public class diameter_BinaryTree {
	static class Node {
		int data;
		Node left;
		Node right;
		Node(int x) {
			data =x;
			left = null;
			right = null;
		}
	}
	//Below is Naive Soln with O(n2)
	static int height(Node root) {
		if(root == null) {
			return 0;
		}
		else {
			return 1+Math.max(height(root.left), height(root.right));
		}
	}
	static int diameter(Node root) {
		if(root==null) return 0;
		int diacenter = height(root.left)+height(root.right);
		int dialeft = diameter(root.left);
		int diaright = diameter(root.right);
		return Math.max(diacenter,Math.max(dialeft,diaright));
	}
	
	//Efficient Solution O(n)
//	static int max = 0;
	static int height1(Node root) {
		
		if(root==null) return 0;
		int lh = height1(root.left);
		int rh = height1(root.right);
//		max = Math.max(max, 1+lh+rh);
		return 1+Math.max(lh, rh);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(60);
	    root.right.left.left=new Node(50);
	    root.right.right.right=new Node(70);
	    System.out.println("diameter -"+ diameter(root));
	    System.out.print("height1 -"+height1(root));
	}

}
