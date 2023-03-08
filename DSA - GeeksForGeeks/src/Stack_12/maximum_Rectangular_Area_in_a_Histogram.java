package Stack_12;

import java.util.Stack;

//https://practice.geeksforgeeks.org/problems/maximum-rectangular-area-in-a-histogram-1587115620/1

public class maximum_Rectangular_Area_in_a_Histogram {
	
	static int getMaxArea(int[] arr, int n) {
		
		int res = 0;
		for(int i =0; i<n; i++) {
			int curr=arr[i];
			for(int j = i-1; j>=0; j--) {
				if(arr[j]>=arr[i]) curr = curr+arr[i];
				else break;
			}
			for(int j = i+1; j<n; j++) {
				if(arr[j]>=arr[i]) curr = curr+arr[i];
				else break;
			}
			
			res = Math.max(res, curr);
		}
		
		return res;
	}
	
//	static int getMaxArea(int[] arr, int n) {
//		
//		Stack<Integer> s = new Stack<>();
//		int res=0,tp=0,curr=0; 
//		for(int i =0; i<n; i++) {
//			while(!s.isEmpty()&&arr[s.peek()]>=arr[i]) {
//				tp = s.peek();
//				s.pop();
//				curr = arr[tp] * (s.isEmpty()?i:(i-s.peek()-1));
//				res = Math.max(res, curr);
//			}
//			s.add(i);
//		}
//		
//		while(!s.isEmpty()) {
//			tp = s.peek();
//			s.pop();
//			curr = arr[tp] * (s.isEmpty()?n:(n-s.peek()-1));
//			res = Math.max(res, curr);
//		}
//		return res;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[]{6,2,5,4,1,5,6};
        
        System.out.print("Maximum Area: "+getMaxArea(arr,arr.length));

	}

}
