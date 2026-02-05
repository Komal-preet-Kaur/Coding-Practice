// User function Template for Java

class Solution {
    public static int closestToZero(int arr[], int n) {
        // your code here
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        int minSum=Integer.MAX_VALUE;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(Math.abs(sum)<Math.abs(minSum) || Math.abs(sum)==Math.abs(minSum) && sum>minSum){
                minSum=sum;
            }
            if(sum<0){
                i++;
            }
            else {
                j--;
            }
            
        }
        return minSum;
    }
}