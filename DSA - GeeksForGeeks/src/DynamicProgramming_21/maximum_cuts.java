package DynamicProgramming_21;

public class maximum_cuts {
	
	//Recursive Approach
	
    // public int maximizeCuts(int n, int a, int b, int c)
    // {
    //   //Your code here
       
    //   if(n<0) return -1;
    //   if(n==0) return 0;
       
    //   int result = Math.max(maximizeCuts(n-a,a,b,c),Math.max(maximizeCuts(n-b,a,b,c),maximizeCuts(n-c,a,b,c)));
                             
    //     if(result==-1) return result;
    //     else return(result+1);
                             
    // }
	
	//Dynamic Programming Approach Tabulation
	static int maxCuts(int n, int a, int b, int c) 
    { 
        
     int dp[]= new int[n+1];
     
     dp[0] =0;
     
     for(int i = 1; i<=n; i++)
     {
         dp[i] = -1;
         
         if(i-a >=0) dp[i] = Math.max(dp[i],dp[i-a]);
         
         if(i-b >=0) dp[i] = Math.max(dp[i],dp[i-b]);
         
         if(i-c >=0) dp[i] = Math.max(dp[i],dp[i-c]);
         
         if(dp[i]!=-1)
            dp[i]++;
     }
  
    return dp[n]==-1?0:dp[n];
       
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5, a = 1, b = 2, c = 3;
        
        System.out.println(maxCuts(n, a, b, c));
	}

}
