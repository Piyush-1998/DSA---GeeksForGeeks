package BinarySearchTree_16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import BinarySearchTree_16.top_view_BST.Node;

public class vertical_traversal_BST {
	
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
	
	static class Pair {
	    Node node;
	    int hd;
	    Pair(Node n, int h ) {
	        node = n;
	        hd = h;
	    }
	}

	static void verticalTraversal(Node root) {
		Queue<Pair> q = new LinkedList<>();
        Map<Integer, ArrayList<Integer>> mp = new TreeMap<>();
        q.add(new Pair(root,0));
//        ArrayList<Integer> al1 = new ArrayList<>();
        while(!q.isEmpty()) {
            Pair p = q.poll();
            Node curr = p.node;
            int hd = p.hd;
            if(mp.containsKey(hd)) {
                mp.get(hd).add(curr.data);
            }
            else {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(curr.data);
                mp.put(hd,al);
            }
            if(curr.left!=null) {
                q.add(new Pair(curr.left, hd-1));
            }
            if(curr.right!=null) {
                q.add(new Pair(curr.right,hd+1));
            }
        }
        for(Map.Entry<Integer, ArrayList<Integer>> p : mp.entrySet()) {
            ArrayList<Integer> al = p.getValue();
           for(int x:al) {
        	   System.out.print(x+" ");
           }
           System.out.println();
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);  
        root.left = new Node(20);  
        root.right = new Node(30);  
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        
        verticalTraversal(root);
	}

}
