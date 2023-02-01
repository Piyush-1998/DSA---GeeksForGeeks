package DynamicProgramming_21;

public class longest_increasing_subsequence_binarysearch {

	public static int LIS(int[] arr, int n ) {
		
		int[] tail = new int[n];
		int len = 1;
		tail[0] = arr[0];
		for(int i = 0; i<n; i++) {
			if(arr[i]>tail[len-1]) {
				tail[len]=arr[i];
				len++;
			}
			else {
				int temp = ceilingfn(tail,0,len-1,arr[i]);
				tail[temp] = arr[i];
			}
		}
		return len;
	}
	
	public static int ceilingfn(int[] tail, int l, int r, int key) {
		while(r>l) {
			int mid = l+(r-l)/2;
			if(tail[mid]>key) {
				r=mid;
			}
			else {
				l = mid+1;
			}
		}
		
		return r;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={3, 10, 20, 4, 6, 7};
        int n = 6;
        
        System.out.println(LIS(arr, n));
	}

}
