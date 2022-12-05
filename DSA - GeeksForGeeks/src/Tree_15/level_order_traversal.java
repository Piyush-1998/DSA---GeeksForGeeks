package Tree_15;

import java.util.LinkedList;
import java.util.Queue;

public class level_order_traversal {
	
	//Naive Approach: is to find out the height of the tree firs and then print nodes till 
	//K distance which we have already done in previous programs. TC : O(h*n). becoz height will take O(n) and
	//loop would be run till height so it becomes O(h*n)
	
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
		
	//This is most optimized Solution
	//Enqueue operation :O(1) & Dequeue Operation: O(1)
	//Time Complexity:O(n) Space Complexity: O(n)
	static void levelordertraversal(Node root) {
		if(root==null) return;
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(q.isEmpty()==false) {
			Node curr = q.poll();
			System.out.print(curr.data+" ");
			if(curr.left!=null) {
				q.add(curr.left);
			}
			if(curr.right!=null) {
				q.add(curr.right);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.left.left=new Node(40);
    	root.left.right=new Node(50);
    	root.right.left=new Node(60);
    	root.right.right=new Node(70);
    	levelordertraversal(root);
	}

}
