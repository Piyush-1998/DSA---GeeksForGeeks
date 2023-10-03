package Tree_15;


public class count_nodes_tree {

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
	//Naive Solution O(n)
	static int count(Node root) {
		if(root==null) return 0;
		else {
			return 1+count(root.left)+count(root.right);
		}
	}
	
	
	// Efficient Solution O(Logn * Logn)
	public static int count1(Node root) {
		int lh = 0;
		int rh = 0;
		Node curr = root;
		while(curr!=null) {
			lh++;
			curr = curr.left;
			}
		curr = root;
		while(curr!=null) {
			rh++;
			curr = curr.right;
			}
		if(lh==rh) return (int)Math.pow(2, lh) - 1;
		else return 1+count1(root.left)+count1(root.right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
    	
    	System.out.println(count(root));
    	System.out.print(count1(root));
	}

}
