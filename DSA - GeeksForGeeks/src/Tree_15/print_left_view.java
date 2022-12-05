package Tree_15;

import java.util.LinkedList;
import java.util.Queue;

import Tree_15.level_order_traversal.Node;

public class print_left_view {
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		Node(int x) {
			data=x;
			left = null;
			right = null;
		}
	}
	
	static void printLeft(Node root) {
		if(root==null) return;
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		while(q.isEmpty()==false) {
			int count = q.size();
			
			for(int i =0; i<count; i++) {
				Node curr = q.poll();
				if(i==0) System.out.print(curr.data+" ");
				if(curr.left!=null) {
					q.add(curr.left);
				}
				if(curr.right!=null) {
					q.add(curr.right);
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
    	printLeft(root);
	}

}
