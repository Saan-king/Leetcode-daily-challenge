
 public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        
		//dp[i][j] means the minimum distance to reach from src to j with atmost i edges. 
		//Note that, we need atmost k stops, so it means atmost k+1 edges are permitted.
		//Hence array is initialized with k+2 size.
        int[][] dp = new int[k+2][n];
        
		//initiallly, we assume that minimum distance to any point from the source is infinity. 
        for(int i=0; i<=k+1; i++){
           for(int j=0; j<n; j++){
		      //Distance from source to source is always zero, irrespective of the number of stops/edges permitted. 
			  //Otherwise, we assume Integer.MAX_VALUE unless it is possible to reach destination. 
               dp[i][j] = j==src?0:Integer.MAX_VALUE;
           } 
        }
              
        for(int i=1; i<=k+1; i++){
            for(int j=0;j<flights.length;j++){           
                int[] flight = flights[j];         
                int source = flight[0];
                int destination = flight[1];
                int price = flight[2];
         
		        //We can reach destination in atmost k stops, only if the source/previous stop can be reachable in k-1 stops. Otherwise, it is impossible to reach the destination within k stops. 
                if(dp[i-1][source] != Integer.MAX_VALUE){
                    dp[i][destination]= Math.min(dp[i][destination], dp[i-1][source] + price);
                }                
            }            
        }
        
        return dp[k+1][dst]==Integer.MAX_VALUE?-1:dp[k+1][dst];
        
    }
