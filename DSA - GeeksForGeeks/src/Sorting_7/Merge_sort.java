package Sorting_7;

public class Merge_sort {

	public static void mergeSort(int[] arr, int start, int end) {
		if(end-start<2) return; // condition for one element array
		int mid = (start+end)/2;
		mergeSort(arr, start, mid);   // Recursive func call for splitting left partition
		mergeSort(arr, mid, end);	  // Recursive func call for splitting right partition
		merge(arr,start,mid,end);     // This func is called for merging the elements
	}
	
	public static void merge(int[] arr, int start, int mid, int end) {
		
		if(arr[mid-1] <= arr[mid]) { // 1st Opitimization
			return;
		}
		
		int i = start;
		int j = mid;
		
		int tempindex = 0;
		int[] temp = new int[end-start];
		while(i<mid && j<end) {
			temp[tempindex++] = arr[i]<=arr[j]?arr[i++]:arr[j++];
		}
		//2nd Optimization 
		
		System.arraycopy(arr, i, arr, start+tempindex, mid-i);
		System.arraycopy(temp, 0, arr, start, tempindex);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {20,35,-15,7,55,1,-22};
		mergeSort(arr,0,arr.length);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

