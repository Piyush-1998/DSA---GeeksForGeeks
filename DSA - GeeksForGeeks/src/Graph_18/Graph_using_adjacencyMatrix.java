package Graph_18;

import java.util.Scanner;

// We are assuming the case of Undirected Graph
//O(NxN) => O(N2)

public class Graph_using_adjacencyMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("No. of Nodes in Graph");
		int n = sc.nextInt();
		System.out.println("No. of Edges in Graph");
		int m = sc.nextInt();
		
		int[][] arr = new int[n+1][n+1];
		
		for(int i = 0; i<m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt(); 
			arr[u][v] = 1;
			arr[v][u] = 1; // this line would be removed in case of directed graph
						
		}
		
		for(int i = 0; i<m; i++) {
			System.out.println();
			for(int j =0; j<m; j++) {
				System.out.print(arr[i][j]);
			}
		}	

	}

}
