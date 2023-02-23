package DynamicProgramming_21;

public class subset_sum_recursion {
	public static void main(String[] args) {
		int[] arr = {10,20,15,25};
		int n = arr.length;
		int sum = 25;
		System.out.println(subsetSum(arr,n,sum));
	}
	public static int subsetSum(int[] arr, int n, int sum) {
		if(n==0) return sum==0?1:0;
		return subsetSum(arr,n-1,sum)+subsetSum(arr,n-1,sum-arr[n-1]);
	}
}
