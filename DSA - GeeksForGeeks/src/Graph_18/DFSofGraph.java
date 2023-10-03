package Graph_18;

import java.util.*;

public class DFSofGraph {
	
	public void DFSGraph(Integer i, boolean[] vis, ArrayList<ArrayList<Integer>> adj,
			ArrayList<Integer> ls ) {
		
		//marking current node as visited
		vis[i] = true;
		ls.add(i);
		
		//getting neighbour nodes
		for(Integer it: adj.get(i)) {
			if(vis[it]==false) {
				DFSGraph(it,vis,adj,ls);
			}
		}
		
	}
	
	// Function to return a list containing the DFS traversal of the graph.
	public ArrayList<Integer> dfs(int V, ArrayList<ArrayList<Integer>> adj) {
		//boolean array to keep track of visited vertices
		boolean[] vis = new boolean[V];
		vis[0] = true;
		ArrayList<Integer> ls = new ArrayList<>();
		DFSGraph(0,vis,adj,ls);
		return ls;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		for(int i =0; i<5; i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		adj.get(0).add(2);
		adj.get(2).add(0);
		adj.get(0).add(1);
		adj.get(1).add(0);
		adj.get(0).add(3);
		adj.get(3).add(0);
		adj.get(2).add(4);
		adj.get(4).add(2);
		
		DFSofGraph d = new DFSofGraph();
		ArrayList<Integer> al = d.dfs(5,adj);
		int n = al.size();
		for(int i =0; i<n; i++) {
			System.out.print(al.get(i)+" ");
		}

	}

}
