package Greedy_19;

import java.util.Arrays;
import java.util.Comparator;

class Item implements Comparable<Item> {
	
	int wt;
	int val;
	Item (int w, int v) {
		wt = w;
		val = v;
	}
	public int compareTo(Item i) {
		return (wt)*(i.val) - (val)*(i.wt);
	}
}

public class Fractional_Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item arr[] = { new Item(10,60),
		new Item(40,40),
		new Item(20,100),
		new Item(30,120)
		};
		
		int w = 50;
		int n = 4;
		System.out.println(fracknapsack(arr,n,w));
	
	}
	
	static double fracknapsack(Item[] arr, int n, int w) {
		Arrays.sort(arr);
		double res = 0.0;
		for(int i =0; i<n; i++) {
			if(arr[i].wt<w) {
				res = res+arr[i].val;
				w = w-arr[i].wt;
			}
			else {
				res = res + arr[i].val*(double) w/(double) arr[i].wt;
			}
		}
		return res;
	}
	
}
