package Tree_15;

import java.util.LinkedList;
import java.util.Queue;

import Tree_15.check_BalancedTree.Node;

public class maximum_width {
	
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int x) {
			data = x;
			left = null;
			right = null;
		}
	}
	
	static int maxWidth(Node root) {
		if(root == null) return 0;
		Queue<Node> q = new LinkedList<>();
		int res = 0;
		q.add(root);
		while(q.isEmpty()==false) {
			int count = q.size();
			res = Math.max(res, count);
			for(int i =0; i<count; i++) {
				Node curr = q.poll();
				if(curr.left!=null) q.add(curr.left);
				if(curr.right!=null) q.add(curr.right);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.left.left=new Node(40);
    	root.left.right=new Node(50);
    	root.right.left=new Node(60);
    	System.out.print(maxWidth(root));
	}

}
