class Solution {
    public int paths(int m ,int n,int dp[][]){
        if(m==1 && n==1)return 1;   //m=0 n=0 return 1 for 0 based indexing
        if(m==0 || n==0)return 0;   //m=-1 n=-1 return 0 for 0 based indexing 
        if(dp[m][n]!=-1)return dp[m][n];
        return dp[m][n]=paths(m,n-1,dp)+paths(m-1,n,dp);
    }
    public int numberOfPaths(int m, int n) {
        int dp[][]=new int[m+1][n+1];   //for 1 based indexing
        //int dp[][]=new int[m][n];   for 0 based indexing
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=-1;
            }
        }
        return paths(m,n,dp);
    }
}