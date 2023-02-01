package Heap_17;

import java.util.PriorityQueue;

public class sort_K_sorted_Array {
	//We can also use predefined functions like Arrays.sort()
	//but its gives Time Complesity of O(nlogn)
	//and below procedure gives O(n+klogk)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,8,7,19,18};
		int k = 2;
		int index = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i =0; i<=k; i++) {
			pq.add(arr[i]);
		}
		for(int i = k+1; i<arr.length; i++) {
			arr[index++] = pq.poll();
			pq.add(arr[i]);
		}
		while(pq.isEmpty()==false) {
			arr[index++] = pq.poll();
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
