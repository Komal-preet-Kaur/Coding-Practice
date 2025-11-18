//Back-end complete function Template for Java

// class Solution {
//     static int minCost(int[]cost, int idx,int dp[]){
//         if(idx>=cost.length)return 0;
//         if(dp[idx]!=-1)return dp[idx];
//         return dp[idx]=cost[idx]+Math.min(minCost(cost,idx+1,dp),minCost(cost,idx+2,dp));
//     }
//     static int minCostClimbingStairs(int[] cost) {
//         int dp[]=new int[cost.length];
//         for(int i=0;i<dp.length;i++){
//             dp[i]=-1;
//         }
//         return Math.min(minCost(cost,0,dp),minCost(cost,1,dp));
//     }
// };

//optmized using tabulation 
//Back-end complete function Template for Java

class Solution {
    static int minCostClimbingStairs(int[] cost) {
        // Write your code here
        int n=cost.length;
        int dp[]=new int[n];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<dp.length;i++){
            dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[n-1],dp[n-2]);
        
    }
};