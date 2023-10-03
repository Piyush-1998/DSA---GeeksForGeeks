package Graph_18;

import java.util.ArrayList;
import java.util.Scanner;

public class Graph_using_adjacencyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("No. of Nodes in Graph");
		int n = sc.nextInt();
		System.out.println("No. of Edges in Graph");
		int m = sc.nextInt();
		
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>(n+1);
		
		for(int i =0; i<=n; i++) {
			al.add(new ArrayList<Integer>());
		}
		for(int i = 0; i<m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt(); 
			al.get(u).add(v);
			al.get(v).add(u); // this line would be removed in case of directed graph						
		}
		for(int i = 1; i<n; i++) {
			for(int j = 0; j<al.get(i).size(); j++) {
				System.out.println(al.get(i).get(j));
			}
		}		
	}
}
