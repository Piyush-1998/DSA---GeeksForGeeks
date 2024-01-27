package Tree_15;

public class check_BalancedTree {
	
	static class Node {
		int data;
		Node left;
		Node right;
		Node(int x) {
			data= x;
			left = null;
			right = null;
		}
	}
	
	static int isBalanced(Node root ) {
		if(root==null) return 0;
		int leftheight = isBalanced(root.left);
		if(leftheight==-1) return -1;
		int rightheight = isBalanced(root.right);
		if(rightheight==-1) return -1;
		if(Math.abs(leftheight-rightheight)>1) return -1;
		else {
			 return Math.max(leftheight, rightheight)+1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(10);
    	root.left=new Node(5);
    	root.right=new Node(30);
    	root.right.left=new Node(15);
    	root.right.right=new Node(20);
    	root.right.right.left=new Node(20);
    	if(isBalanced(root)>0) {
    		System.out.print("Balanced Tree");
    	}
    	else {
    		System.out.print("Not Balanced Tree");
    	}
	}

}
