package Graph_18;

import java.util.ArrayList;
import java.util.*;

public class BFSofGraph {
	
	public ArrayList<Integer> bfs(int n, ArrayList<ArrayList<Integer>> adj) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		boolean[] vis = new boolean[n];
		Queue<Integer> q = new LinkedList<>();
		
		q.add(0);
		vis[0]=true;
		
		while(!q.isEmpty()) {
			Integer i = q.poll();
			al.add(i);
			
			// Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
			
			for(Integer it: adj.get(i)) {
				if(vis[it]==false) {
					vis[it]=true;
					q.add(it);
				}
				
			}
			
		}
		return al;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		for(int i =0; i<5; i++) {
			adj.add(new ArrayList<>());
		}
		
		adj.get(0).add(1);
		adj.get(1).add(0);
		adj.get(0).add(4);
		adj.get(4).add(0);
		adj.get(1).add(2);
		adj.get(2).add(1);
		adj.get(1).add(3);
		adj.get(3).add(1);
		
		BFSofGraph b = new BFSofGraph();
		
		ArrayList<Integer> ans = b.bfs(5, adj);
		int n = ans.size();
		for(int i = 0; i<n; i++ ) {
			System.out.println(ans.get(i)+" ");
		}
		

	}

}
