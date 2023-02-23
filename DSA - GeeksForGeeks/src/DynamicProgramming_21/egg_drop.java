package DynamicProgramming_21;

public class egg_drop {
	
	//Recursive Approach
	public static int eggdrop(int n, int k) {
		
		if(k==1||k==0) return k;
		
		if(n==1) return k;
		
		int min = Integer.MAX_VALUE;
		int result = 0;
		
		for(int i = 1; i<=k; i++) {
			result = Math.max(eggdrop(n-1,i-1), eggdrop(n,k-i));
			
			if(result<min) min=result;
		}
		
		return min+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2, k = 10; 
		System.out.print("Minimum number of "
						+ "trials in worst case with "
						+ n + " eggs and " + k 
						+ " floors is " + eggdrop(n, k));
	}

}
