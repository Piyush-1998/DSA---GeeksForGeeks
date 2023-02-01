package BinarySearchTree_16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class bottom_view_BST {
	
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
	
	static class Pair {
		Node node;
		int hd;
		Pair(Node n, int h){
			node  = n;
			hd = h;
		}
	}
	
	static void bottomView(Node root) {
		Queue<Pair> q = new LinkedList<>();
		Map<Integer, Integer> mp = new TreeMap<>();
		q.add(new Pair(root,0));
		while(!q.isEmpty()) {
			Pair p = q.poll();
			Node curr = p.node;
			int hd = p.hd;
			mp.put(hd, curr.data);
			if(curr.left!=null) {
				q.add(new Pair(curr.left,hd-1));
			}
			if(curr.right!=null) {
				q.add(new Pair(curr.right,hd+1));
			}
		}
			for(Map.Entry<Integer,Integer> x:mp.entrySet()){
	            System.out.print(x.getValue()+" ");
	    }
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);  
        root.left = new Node(20);  
        root.right = new Node(30);  
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        
        bottomView(root);
	}

}
