package DynamicProgramming_21;

public class longest_increasing_subsequence_DP {
	
	public static int LIS(int[] arr, int n) {
		int[] lis = new int[n];
		lis[0]=1;
		for(int i =1;i<n; i++) {
			lis[i]=1;
			for(int j = 0; j<i; j++) {
				if(arr[i]>arr[j]) {
					lis[i] = Math.max(lis[i], lis[j]+1);
				}
			}
		}
		int res = lis[0];
		
		for(int i = 0; i<n; i++) {
			res = Math.max(lis[i],res);
		}
		
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={3, 10, 20, 4, 6, 7};
        int n = 6;
        
        System.out.println(LIS(arr, n));

	}

}
