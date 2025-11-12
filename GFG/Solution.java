class Solution {
    public int maxLoot(int []arr,int idx, int dp[]){
        if(idx>=arr.length)return 0;
        if(dp[idx]!=-1)return dp[idx];
        int steal=arr[idx]+maxLoot(arr,idx+2,dp);
        int skip=maxLoot(arr,idx+1,dp);
        return dp[idx]=Math.max(steal,skip);
    }
    public int findMaxSum(int arr[]) {
        int dp[]=new int[arr.length];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return maxLoot(arr,0,dp);
    }
}