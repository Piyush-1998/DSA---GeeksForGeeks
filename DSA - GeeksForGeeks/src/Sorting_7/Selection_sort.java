package Sorting_7;
import java.util.Scanner;

public class Selection_sort {
	
	// https://youtu.be/HGk_ypEuS24?si=7_mfEkR2ehdBiZwW&t=429
	//Optimised Solution TC : O(n2)
	//How to remember : "Get the minimum & Swap it"
	public static void selection(int[] arr, int n) {
		for(int i = 0; i<=n-2; i++) {
			int min = i;
			for(int j = i; j<=n-1; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
				
			} 
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	
	//https://youtu.be/HGk_ypEuS24?si=w1IDnpWd9qT-cLlV&t=1605
	//Optimised Solution TC: O(n2) Best case TC is O(n) when the array is already sorted 
	//in ascending order and if in descending order we still need to perform sort..
	//How to remember : "Push the max element to the last"
	public static void bubble(int[] arr, int n) {
		for(int i = n-1; i>=0; i--) {
			int swap = 0; // Optimization for ascending order becoz if we arr is already
			//sorted their is no point comparing for each value with its adjacent value. 
			//So we will identify this thing with swap variable and if swap value is 0 we can break 
			//out of this loop.
			for(int j = 0; j<=i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					swap = 1;
				}
			}
			if(swap==0) {
				break;
			}
		}
	}
	
	
	public static void insertion(int[] arr, int n) {
		for(int i = 0; i<n; i++) {
			int j = i;
			while(j>0 && arr[j-1]>arr[j]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
		
		int n  = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
//		selection(arr,n);
//		bubble(arr,n);
		insertion(arr, n);
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
