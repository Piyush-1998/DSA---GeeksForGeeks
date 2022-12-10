package Tree_15;

import Tree_15.print_left_view.Node;

public class childrenSum_Parent {
	
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
	
	static int childrenSum(Node root) {
		if(root==null) return 1;
		if(root.left==null && root.right==null) {
			return 1;
		}
		int sum = 0;
		if(root.left!=null) {
			sum = sum+root.left.data;
		}
		if(root.right!=null) {
			sum = sum+root.right.data;
		}
		if(root.data==sum && childrenSum(root.left)==1 && childrenSum(root.right)==1) return 1;
		else return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(20);
    	root.left=new Node(8);
    	root.right=new Node(12);
    	root.right.left=new Node(3);
    	root.right.right=new Node(9);
    	System.out.print(childrenSum(root));
	}

}
