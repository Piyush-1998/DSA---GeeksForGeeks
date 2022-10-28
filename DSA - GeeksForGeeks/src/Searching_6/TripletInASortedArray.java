package Searching_6;

import java.util.Scanner;

//Question - To find if there is a triplet with sum equals to X.

public class TripletInASortedArray {
	
	static boolean isPair(int[] arr, int x, int si) {
		int i = si;
		int j = arr.length-1;
		while(i<j) {
			if(arr[i] + arr[j] == x) {
				return true;
			}
			else if(arr[i] + arr[j] < x) {
				i++;
			}
			else {
				j = j-1;
			}
			
		}
		return false;
	}
	
	static boolean Triplet(int[] arr, int x) {
		for(int i = 0; i<arr.length-2; i++) {
			if(isPair(arr, x-arr[i], i+1)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		System.out.print(Triplet(arr,x));
	}

}

//Time Complexity : O(n3)
//Time Complexity : O(1)
