class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int origSum=n*(n+1)/2;
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
        }
        return origSum-currSum;
    }
}