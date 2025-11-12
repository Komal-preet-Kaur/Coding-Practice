class Solution {
    public int stairs(int n, int[]dp){
        if(n==1)return 1;
        if(n==2)return 2;
        if(dp[n]!=-1)return dp[n];

        return dp[n]=stairs(n-1,dp)+stairs(n-2,dp);

    }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return stairs(n,dp);
    }
}