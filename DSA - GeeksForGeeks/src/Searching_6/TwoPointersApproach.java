package Searching_6;

import java.util.Scanner;

//Question - To find if there is a pair with sum equals to X.

public class TwoPointersApproach {
	
	static boolean isPair(int[] arr, int X) {
		int i = 0; 
		int j = arr.length-1;
		while(i<j) {
			if(arr[i]+arr[j] == X) {
				return true;
			}
			else if(arr[i] + arr[j] > X) {
				j = j-1;
			}
			else {
				i++;
			}
			
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int X = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(isPair(arr, X));
	}

}

